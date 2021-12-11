package Clases;

public class Proveedor 
{
    private int RUCProveedor;
    private String razonSocial;

    public Proveedor(int RUCProveedor, String razonSocial) {
        this.RUCProveedor = RUCProveedor;
        this.razonSocial = razonSocial;
    }

    public int getRUCProveedor() {
        return RUCProveedor;
    }

    public void setRUCProveedor(int RUCProveedor) {
        this.RUCProveedor = RUCProveedor;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String toString() {
        return "RUC Proveedor: " + RUCProveedor + 
                "Razon Social: " + razonSocial;
    }
    
    
}
