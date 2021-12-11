package Clases;

public class Telefono 
{
    private String DNI;
    private String telefonoCliente;

    public Telefono(String DNI, String telefonoCliente) 
    {
        this.DNI = DNI;
        this.telefonoCliente = telefonoCliente;
    }
    
    public Telefono()
    {
        
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getTelefono_Cliente() {
        return telefonoCliente;
    }

    public void setTelefono_Cliente(String Telefono_Cliente) {
        this.telefonoCliente = Telefono_Cliente;
    }

    public String toString() 
    {
        return "DNI: " + DNI + 
                "Telefono Cliente: " + telefonoCliente;
    }
}
