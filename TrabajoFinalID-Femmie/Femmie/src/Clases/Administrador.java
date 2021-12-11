
package Clases;


public class Administrador 
{
    private int codUsuario;
    private String clave;
    private String nomUsuario;

    public Administrador(int codUsuario, String clave, String nomUsuario) {
        this.codUsuario = codUsuario;
        this.clave = clave;
        this.nomUsuario = nomUsuario;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String toString() {
        return "Cod Usuario: " + codUsuario + 
                "Clave: " + clave + 
                "Nombre Usuario: " + nomUsuario;
    }
    
    
}
