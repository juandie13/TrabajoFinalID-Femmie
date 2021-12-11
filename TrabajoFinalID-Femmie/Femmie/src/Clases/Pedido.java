
package Clases;

import java.sql.Date;

public class Pedido 
{
    private String numPedido;
    private String numPromocion;
    private String codDelivery;
    private String tarjeta;
    private String numeroTarjeta;
    private String dni;
    private String fechaRegistro;
    private String fechaEntrega;
    private String estadoPedido;
    public Pedido(String numPedido, String numPromocion, String codDelivery, 
            String tarjeta, String numeroTarjeta, String dni,String fechaRegistro,String fechaEntrega ,String estadoPedido) {
        this.numPedido = numPedido;
        this.numPromocion = numPromocion;
        this.codDelivery = codDelivery;
        this.tarjeta = tarjeta;
        this.numeroTarjeta = numeroTarjeta;
        this.dni = dni;
        this.fechaRegistro = fechaRegistro;
        this.fechaEntrega = fechaEntrega;
        this.estadoPedido = estadoPedido;
    }

    public Pedido() {
    }

  

   
    public String getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(String numPedido) {
        this.numPedido = numPedido;
    }

    public String getCodDelivery() {
        return codDelivery;
    }

    public void setCodDelivery(String codDelivery) {
        this.codDelivery = codDelivery;
    }

    public String getNumPromocion() {
        return numPromocion;
    }

    public void setNumPromocion(String numPromocion) {
        this.numPromocion = numPromocion;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

  
    

    public String toString() {
        return "Num Pedido: " + numPedido + " " +
                "Num Promocion: " + numPromocion + " "+
                "Cod Delivery: " + codDelivery+ " "+
                "Banco de la Tarjeta: "+tarjeta+" "+
                "Numero de la tarjeta: "+numeroTarjeta+" "+
                "Dni del cliente: "+dni;
    }

    public void setFecha(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
