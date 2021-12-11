package Clases;

public class TrasladarPedido 
{
    private int numPedido;
    private int codDelivery;
    private String fechaRegistro;
    private String fechaEntrega;

    public TrasladarPedido(int numPedido, int codDelivery, String fechaRegistro, String fechaEntrega) {
        this.numPedido = numPedido;
        this.codDelivery = codDelivery;
        this.fechaRegistro = fechaRegistro;
        this.fechaEntrega = fechaEntrega;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public int getCodDelivery() {
        return codDelivery;
    }

    public void setCodDelivery(int codDelivery) {
        this.codDelivery = codDelivery;
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

    public String toString() {
        return "Num Pedido: " + numPedido + 
                "Cod Delivery: " + codDelivery + 
                "Fecha Registro: " + fechaRegistro + 
                "Fecha Entrega: " + fechaEntrega;
    }
    
    
}
