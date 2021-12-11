package Clases;

public class CompraTela 
{
    private String codTela;
    private int RUCProveedor;
    private int fechaVenta;

    public CompraTela(String codTela, int RUCProveedor, int fechaVenta) {
        this.codTela = codTela;
        this.RUCProveedor = RUCProveedor;
        this.fechaVenta = fechaVenta;
    }

    public String getCodTela() {
        return codTela;
    }

    public void setCodTela(String codTela) {
        this.codTela = codTela;
    }

    public int getRUCProveedor() {
        return RUCProveedor;
    }

    public void setRUCProveedor(int RUCProveedor) {
        this.RUCProveedor = RUCProveedor;
    }

    public int getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(int fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String toString() {
        return "Cod Tela: " + codTela + 
                "RUC Proveedor: " + RUCProveedor + 
                "Fecha Venta: " + fechaVenta;
    }
    
    
}
