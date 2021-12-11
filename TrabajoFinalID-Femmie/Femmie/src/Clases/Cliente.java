
package Clases;


public class Cliente 
{
    private String DNI;
    private String Nombre;
    private String Correo;
    private String Direccion;
    private String Telefono;
    
    public Cliente(String DNI, String Nombre, String Correo, String Direccion ,String Telefono ) 
    {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
    }
    
    public Cliente()
    {
        
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDNI() 
    {
        return DNI;
    }

    public void setDNI(String DNI) 
    {
        this.DNI = DNI;
    }

    public String getNombre() 
    {
        return Nombre;
    }

    public void setNombre(String Nombre) 
    {
        this.Nombre = Nombre;
    }

    public String getCorreo() 
    {
        return Correo;
    }

    public void setCorreo(String Correo) 
    {
        this.Correo = Correo;
    }

    public String getDireccion() 
    {
        return Direccion;
    }

    public void setDireccion(String Direccion) 
    {
        this.Direccion = Direccion;
    }

    
   
    
    public String toString() 
    {
        return "\nDNI: " + DNI + " " +
                "\nNombre: " + Nombre + " " +
                "\nCorreo: " + Correo + " " +
                "\nDireccion: " + Direccion +
                "\n---------------------------";
    }
}
