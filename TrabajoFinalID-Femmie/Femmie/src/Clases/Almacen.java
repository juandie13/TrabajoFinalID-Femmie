
package Clases;


public class Almacen 
{
    private String codAlm;
    private int stockReal;
    private int codUsuario;

    public Almacen(String codAlm, int stockReal, int codUsuario) {
        this.codAlm = codAlm;
        this.stockReal = stockReal;
        this.codUsuario = codUsuario;
    }
    
    public Almacen()
    {
        
    }

    public String getCodAlm() {
        return codAlm;
    }

    public void setCodAlm(String codAlm) {
        this.codAlm = codAlm;
    }

    public int getStockReal() {
        return stockReal;
    }

    public void setStockReal(int stockReal) {
        this.stockReal = stockReal;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    

    public String toString() {
        return "Cod Almacen: " + codAlm +
                "Stock Real: " + stockReal +
                "Cod Usuario: " + codUsuario;
    }
    
    
}
