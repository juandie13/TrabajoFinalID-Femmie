package Clases;

public class Producto 
{
    private String SKU;
    private String seccion;
    private String categoria;
    private String linea;
    private String modelo;
    private String color;
    private String medida;
    private int precioUnitario;

    public Producto(String SKU, String seccion, String categoria, String linea, String modelo, String color, String medida, int precioUnitario) {
        this.SKU = SKU;
        this.seccion = seccion;
        this.categoria = categoria;
        this.linea = linea;
        this.modelo = modelo;
        this.color = color;
        this.medida = medida;
        this.precioUnitario = precioUnitario;
    }

    public Producto() 
    {
    
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    

    public String toString() {
        return "SKU: " + SKU + 
                "Seccion: " + seccion + 
                "Categoria: " + categoria + 
                "Linea: " + linea + 
                "Modelo: " + modelo + 
                "Color: " + color + 
                "Medida: " + medida +
                "Precio Unitario: " + precioUnitario;
    }
    
    
}
