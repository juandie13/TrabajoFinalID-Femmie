package Clases;

public class Delivery 
{
    private int codDelivery;
    private String nombreDelivery;
    private int costo;
    private String fechaRegistro;
    private String fechaEntrega;
    private String tipo;

    public Delivery(int codDelivery, String nombreDelivery, int costo, String fechaRegistro, String fechaEntrega, String tipo) {
        this.codDelivery = codDelivery;
        this.nombreDelivery = nombreDelivery;
        this.costo = costo;
        this.fechaRegistro = fechaRegistro;
        this.fechaEntrega = fechaEntrega;
        this.tipo = tipo;
    }

    public int getCodDelivery() {
        return codDelivery;
    }

    public void setCodDelivery(int codDelivery) {
        this.codDelivery = codDelivery;
    }

    public String getNombreDelivery() {
        return nombreDelivery;
    }

    public void setNombreDelivery(String nombreDelivery) {
        this.nombreDelivery = nombreDelivery;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return "Cod Delivery: " + codDelivery + 
                "Nombre Delivery: " + nombreDelivery + 
                "Costo: " + costo + 
                "Fecha Registro: " + fechaRegistro + 
                "Fecha Entrega: " + fechaEntrega + 
                "Tipo: " + tipo;
    }

    
    
}
