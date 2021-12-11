package Clases;

public class RegistrarEmp 
{
    private int codEmp;
    private String codAlm;
    private int cantidad;
    private int transferido;
    private int defectuoso;
    private int fecha;

    public RegistrarEmp(int codEmp, String codAlm, int cantidad, int transferido, int defectuoso, int fecha) {
        this.codEmp = codEmp;
        this.codAlm = codAlm;
        this.cantidad = cantidad;
        this.transferido = transferido;
        this.defectuoso = defectuoso;
        this.fecha = fecha;
    }

    public int getCodEmp() {
        return codEmp;
    }

    public void setCodEmp(int codEmp) {
        this.codEmp = codEmp;
    }

    public String getCodAlm() {
        return codAlm;
    }

    public void setCodAlm(String codAlm) {
        this.codAlm = codAlm;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTransferido() {
        return transferido;
    }

    public void setTransferido(int transferido) {
        this.transferido = transferido;
    }

    public int getDefectuoso() {
        return defectuoso;
    }

    public void setDefectuoso(int defectuoso) {
        this.defectuoso = defectuoso;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String toString() {
        return "Cod Empaque: " + codEmp + 
                "Cod Almacen: " + codAlm + 
                "Cantidad: " + cantidad + 
                "Transferido: " + transferido + 
                "Defectuoso: " + defectuoso + 
                "Fecha: " + fecha;
    }
    
    
}
