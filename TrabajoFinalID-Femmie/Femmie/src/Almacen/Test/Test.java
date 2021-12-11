
package Almacen.Test;

import Almacen.BO.AlmacenBO;
import Clases.Almacen;


public class Test 
{
    AlmacenBO almBO = new AlmacenBO();
    Almacen alm = new Almacen();
    String mensaje = "";
    
    public void insertarAlmacen()
    {
        alm.setCodAlm("A");
        alm.setStockReal(40);
        alm.setCodUsuario(87642865);
        
        mensaje = almBO.registrarAlmacen(alm);
        System.out.println(mensaje);
    }
    
    public void eliminarAlmacen()
    {
        mensaje = almBO.eliminarAlmacen("A");
        System.out.println(mensaje);
    }
    
    public static void main(String[] args) 
    {
        Test test = new Test();
        test.insertarAlmacen();
        //test.eliminarAlmacen();
    }
}
