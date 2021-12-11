
package Test;
import java.util.Date ;
import Clases.Cliente;
import Clases.Pedido;
import Clases.Producto;
import Clases.Telefono;
import Cllases.BO.ClienteBO;
import Cllases.BO.PedidoBO;
import Cllases.BO.ProductoBO;
import java.text.SimpleDateFormat;
import java.util.Set;

public class Test 
{
    ClienteBO cliBO = new ClienteBO();
    Cliente cli = new Cliente();
    Telefono tel = new Telefono();
    String mensaje = "";
   
    
    PedidoBO pedBO = new PedidoBO();
    Pedido ped = new Pedido();
   
    String mensaje2 = "";
    
    ProductoBO pBO;
    Producto pro = new Producto();
    String mensajito = "";

    public Test() {
        this.pBO = new ProductoBO();
    }
    
    public void insertarPro()
    {
        pro.setSKU("12345678");
        pro.setSeccion("Forrete");
        pro.setCategoria("Forritos");
        pro.setLinea("De dia");
        pro.setModelo("Guapo");
        pro.setColor("Turquesa");
        pro.setMedida("XL");
        pro.setPrecioUnitario(35);
        
        mensajito=pBO.agregarProducto(pro);
        System.out.println(mensajito);
    }
    
    public void modificarPro()
    {
       pro.setSKU("12345678");
       pro.setSeccion("Forrete");
       pro.setCategoria("Forritos");
       pro.setLinea("De dia");
       pro.setModelo("Guapo");
       pro.setColor("Turquesa");
       pro.setMedida("XL");
       pro.setPrecioUnitario(35);
       mensaje=pBO.modificarProducto(pro);
       System.out.println(mensajito); 
    }
    /*
    public void eliminarPro()
    {
        mensajito = pBO.eliminarProducto("12345678");
        System.out.println(mensajito);
    }
    */
    public void insertarPedido()
    {
     
        ped.setNumPedido("12457892");
        ped.setNumPromocion("159159");
        ped.setCodDelivery("200");
        ped.setFechaRegistro("10/12/2021");
        ped.setFechaEntrega("11/12/2021");

        //ped.setDni(123123);
        //ped.setEstadoPedido("REGISTRADO");
        //ped.setTarjeta("BCP");
        //ped.setNumeroTarjeta("1548954021");
        //tel.setTelefono_Cliente(969915077);
        
        mensaje2 = pedBO.registrarPedido(ped);
        System.out.println(mensaje2);
    }
    public void insertarCliente()
    {
//        cli.setDNI(73112007);
//        cli.setNombre("ALISSON GALLARDO GUEVARA");
//        cli.setCorreo("ALISSON.GALLARDO@GMAIL.COM");
//        cli.setDireccion("AV. PERU 545 - COMAS");
//        mensaje = cliBO.registrarCliente(cli);
//        System.out.println(mensaje);
        
        //cli.setDNI(73112007);
        cli.setNombre("ALISSON GALLARDO");
        cli.setCorreo("ALISSON.G@GMAIL.COM");
        cli.setDireccion("AV. PERU 460 - LIMA");
        //tel.setTelefono_Cliente(969915077);
        
        mensaje = cliBO.registrarCliente(cli);
        System.out.println(mensaje);
    }
    
    
    public void actualizarCliente()
    {
        //cli.setDNI('3112007');
        cli.setNombre("ALISSON GALLARDO");
        cli.setCorreo("ALISSON.G@GMAIL.COM");
        cli.setDireccion("AV. PERU 460 - LIMA");
        mensaje = cliBO.actualizarCliente(cli);
        System.out.println(mensaje);
    }
    
    public void eliminarCliente()
    {
        //mensaje = cliBO.eliminarCliente('17835482');
        System.out.println(mensaje);
    }     
   
    public static void main(String[] args)
    {
        Test test = new Test();
        test.modificarPro();
    }
}
