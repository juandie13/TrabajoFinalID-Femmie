package Clases;

public class ContProd 
{
    private int numPedido;
    private int SKU;
    private int cantidad;

    public ContProd(int numPedido, int SKU, int cantidad) {
        this.numPedido = numPedido;
        this.SKU = SKU;
        this.cantidad = cantidad;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public int getSKU() {
        return SKU;
    }

    public void setSKU(int SKU) {
        this.SKU = SKU;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String toString() {
        return "Num Pedido: " + numPedido + 
                "SKU: " + SKU + 
                "Cantidad: " + cantidad;
    }
    
    
}
