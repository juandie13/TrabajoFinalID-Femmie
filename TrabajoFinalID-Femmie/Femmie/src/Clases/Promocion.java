package Clases;

public class Promocion 
{
    private int numPromocion;
    private String nombreProm;
    private int descuento;

    public Promocion(int numPromocion, String nombreProm, int descuento) {
        this.numPromocion = numPromocion;
        this.nombreProm = nombreProm;
        this.descuento = descuento;
    }

    public int getNumPromocion() {
        return numPromocion;
    }

    public void setNumPromocion(int numPromocion) {
        this.numPromocion = numPromocion;
    }

    public String getNombreProm() {
        return nombreProm;
    }

    public void setNombreProm(String nombreProm) {
        this.nombreProm = nombreProm;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public String toString() {
        return "Num Promocion: " + numPromocion + " " +
                "Nombre Prom: " + nombreProm + " " +
                "Descuento: " + descuento;
    }
    
    
}
