package Clases;

public class Empaque 
{
    private int codEmp;
    private String tipo;
    private int costo;

    public Empaque(int codEmp, String tipo, int costo) {
        this.codEmp = codEmp;
        this.tipo = tipo;
        this.costo = costo;
    }

    public int getCodEmp() {
        return codEmp;
    }

    public void setCodEmp(int codEmp) {
        this.codEmp = codEmp;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String toString() {
        return "Cod Emp: " + codEmp + 
                "Tipo: " + tipo + 
                "Costo: " + costo;
    }
    
    
}
