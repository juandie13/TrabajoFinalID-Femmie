
package Clases;


public class AtencionCliente 
{
    private int codUsuario;
    private String medioContacto;

    public AtencionCliente(int codUsuario, String medioContacto) {
        this.codUsuario = codUsuario;
        this.medioContacto = medioContacto;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getMedioContacto() {
        return medioContacto;
    }

    public void setMedioContacto(String medioContacto) {
        this.medioContacto = medioContacto;
    }

    public String toString() {
        return "Cod Usuario: " + codUsuario + 
                "Medio Contacto: " + medioContacto;
    }
    
    
}
