
CREATE OR REPLACE FUNCTION PRECIO_TODO(codPedido PEDIDO.NUM_PEDIDO%TYPE)
RETURN NUMBER
AS 
    precio_final NUMBER(15); 
    todos Number(15);
    CURSOR CUR_PED_CIU IS
         SELECT PRODUC.SKU, PRODUC.PRECIO_UNITARIO, C.CANTIDAD
         FROM PROMOCION PRO, PEDIDO P, CONT_PROD C, PRODUCTO PRODUC 
         WHERE P.COD_PROMOCION = PRO.COD_PROMOCION(+)
         AND  P.NUM_PEDIDO(+) = C.NUM_PEDIDO
         AND PRODUC.SKU = C.SKU
         AND P.NUM_PEDIDO = codPedido ; 
BEGIN
     precio_final :=0;
     todos := 0;
     FOR PED IN CUR_PED_CIU LOOP
        todos := PED.PRECIO_UNITARIO * PED.CANTIDAD;
        precio_final := precio_final + todos;
    END LOOP;     
    RETURN precio_final;
END;
 
 
CREATE OR REPLACE FUNCTION aplicar_promocion(codPedido PEDIDO.NUM_PEDIDO%TYPE)
RETURN NUMBER
AS
     descuento NUMBER(12);
     precio_F NUMBER(12);
BEGIN
-- LLLAMAR A LA FUNCION DE ANTES
    SELECT PRECIO_TODO(NUM_PEDIDO)
    INTO precio_f
    FROM PEDIDO
    
    WHERE NUM_PEDIDO = codPedido;
    SELECT PROMO.DESCUENTO
    INTO descuento
    FROM PROMOCION PROMO, PEDIDO P
    WHERE P.COD_PROMOCION = PROMO.COD_PROMOCION(+)
    AND P.NUM_PEDIDO = codPedido;
    
    IF descuento IS NOT NULL THEN
        precio_F :=  precio_F * (1 - (descuento/100) );
    END IF;
    RETURN precio_F;
END; 

CREATE OR REPLACE FUNCTION PRECIO_FINAL(codPedido PEDIDO.NUM_PEDIDO%TYPE)
RETURN NUMBER
AS
     costo_delivery DELIVERY.COSTO%TYPE;
     precio_F NUMBER(12);
BEGIN
    SELECT aplicar_promocion(NUM_PEDIDO)
    INTO precio_F
    FROM PEDIDO
    WHERE NUM_PEDIDO = codPedido;
    
    SELECT D.COSTO 
    INTO costo_delivery
    FROM PEDIDO P, DELIVERY D
    WHERE P.COD_DELIVERY = D.COD_DELIVERY(+)
    AND P.NUM_PEDIDO = codPedido;
    
    IF costo_delivery IS NOT NULL THEN
        precio_F :=  precio_F + costo_delivery;
    END IF;
    
    RETURN precio_F;
END;

