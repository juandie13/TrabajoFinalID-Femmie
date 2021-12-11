package Clases;

public class Tela 
{
    private String codTela;
    private String tipo;
    private int costo;
    private String color;

    public Tela(String codTela, String tipo, int costo, String color) {
        this.codTela = codTela;
        this.tipo = tipo;
        this.costo = costo;
        this.color = color;
    }

    public String getCodTela() {
        return codTela;
    }

    public void setCodTela(String codTela) {
        this.codTela = codTela;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Cod Tela: " + codTela + 
                "Tipo: " + tipo + 
                "Costo: " + costo + 
                "Color: " + color;
    }
    
    
}
