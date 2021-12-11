package Clases;

public class TelProveedor 
{
    private int RUCProveedor;
    private int telfPrivado;

    public TelProveedor(int RUCProveedor, int telfPrivado) {
        this.RUCProveedor = RUCProveedor;
        this.telfPrivado = telfPrivado;
    }

    public int getRUCProveedor() {
        return RUCProveedor;
    }

    public void setRUCProveedor(int RUCProveedor) {
        this.RUCProveedor = RUCProveedor;
    }

    public int getTelfPrivado() {
        return telfPrivado;
    }

    public void setTelfPrivado(int telfPrivado) {
        this.telfPrivado = telfPrivado;
    }

    public String toString() {
        return "RUC Proveedor: " + RUCProveedor + 
                "Telefono Privado:" + telfPrivado;
    }
    
    
}
