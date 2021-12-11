package Clases;

public class RegistrarProd1 
{
    private String numPedido;
    private String SKU;
    private int cantidad;

    public RegistrarProd1(String numPedido, String SKU, int cantidad) {
        this.numPedido = numPedido;
        this.SKU = SKU;
        this.cantidad = cantidad;
    }
    
    public RegistrarProd1()
    {
        
    }

    public String getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(String numPedido) {
        this.numPedido = numPedido;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
