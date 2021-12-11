package Clases;

public class CompraEmpaque 
{
    private int codEmp;
    private int fechaVenta;
    private int RUCProveedor;

    public CompraEmpaque(int codEmp, int fechaVenta, int RUCProveedor) {
        this.codEmp = codEmp;
        this.fechaVenta = fechaVenta;
        this.RUCProveedor = RUCProveedor;
    }

    public int getCodEmp() {
        return codEmp;
    }

    public void setCodEmp(int codEmp) {
        this.codEmp = codEmp;
    }

    public int getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(int fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getRUCProveedor() {
        return RUCProveedor;
    }

    public void setRUCProveedor(int RUCProveedor) {
        this.RUCProveedor = RUCProveedor;
    }

    public String toString() {
        return "Cod Empaque: " + codEmp + 
                "Fecha Venta: " + fechaVenta + 
                "RUC Proveedor: " + RUCProveedor;
    }
}
