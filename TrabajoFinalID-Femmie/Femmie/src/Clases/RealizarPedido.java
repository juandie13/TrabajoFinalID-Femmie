package Clases;

public class RealizarPedido 
{
    private int DNI;
    private int numPedido;
    private String fecha;
    private String estadoPedido;
    private String tarjeta;

    public RealizarPedido(int DNI, int numPedido, String fecha, String estadoPedido, String tarjeta) {
        this.DNI = DNI;
        this.numPedido = numPedido;
        this.fecha = fecha;
        this.estadoPedido = estadoPedido;
        this.tarjeta = tarjeta;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String toString() {
        return "DNI: " + DNI + " " +
                "Num Pedido: " + numPedido + " " +
                "Fecha: " + fecha + " " +
                "Estado Pedido: " + estadoPedido + " " +
                "Tarjeta: " + tarjeta;
    }
    
    
}
