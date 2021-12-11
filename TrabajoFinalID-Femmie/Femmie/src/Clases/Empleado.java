package Clases;

public class Empleado 
{
    private int codUsuario;
    private String nombre;

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return "Cod Usuario: " + codUsuario + 
                "Nombre: " + nombre;
    }
    
    
}
