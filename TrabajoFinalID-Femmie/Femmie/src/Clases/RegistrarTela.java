package Clases;

public class RegistrarTela 
{
    private String codAlm;
    private String codTela;
    private int cantidad;
    private int fecha;

    public RegistrarTela(String codAlm, String codTela, int cantidad, int fecha) {
        this.codAlm = codAlm;
        this.codTela = codTela;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public String getCodAlm() {
        return codAlm;
    }

    public void setCodAlm(String codAlm) {
        this.codAlm = codAlm;
    }

    public String getCodTela() {
        return codTela;
    }

    public void setCodTela(String codTela) {
        this.codTela = codTela;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String toString() 
    {
        return "Cod Almacen: " + codAlm + 
                "Cod Tela: " + codTela + 
                "Cantidad: " + cantidad + 
                "Fecha: " + fecha;
    }
    
    
}
