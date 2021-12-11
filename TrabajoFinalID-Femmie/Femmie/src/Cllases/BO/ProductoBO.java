package Cllases.BO;

import Clases.Producto;
import DAO.ProductoDAO;
import Datos.util.JdbcUtil;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

public class ProductoBO 
{
    private String mensaje="";
    private ProductoDAO proDAO = new ProductoDAO();
    
    public String agregarProducto(Producto pro)
    {
        Connection conn = JdbcUtil.getConnection();
        try
        {
            mensaje= proDAO.agregarProducto(conn, pro);
        }
        catch(Exception e)
        {
            mensaje = mensaje + " " +e.getMessage();
        }
        finally
        {
            try
                {
                    if(conn!=null)
                    {
                        conn.close();
                    }
                }
            catch(Exception e)
                {
                    mensaje=mensaje+" "+e.getMessage();
                }
        }
        return mensaje;
    }
    
    public String modificarProducto(Producto pro)
    {
        Connection conn = JdbcUtil.getConnection();
        try
        {
            mensaje= proDAO.modificarProducto(conn, pro);
        }
        catch(Exception e)
        {
            mensaje = mensaje + " " +e.getMessage();
        }
        finally
        {
            try
                {
                    if(conn!=null)
                    {
                        conn.close();
                    }
                }
            catch(Exception e)
                {
                    mensaje=mensaje+" "+e.getMessage();
                }
        }
        return mensaje;
    }
    
    public String eliminarProducto(int sku)
    {
        Connection conn = JdbcUtil.getConnection();
        try
        {
            mensaje= proDAO.eliminarProducto(conn, sku);
        }
        catch(Exception e)
        {
            mensaje = mensaje + " " +e.getMessage();
        }
        finally
        {
            try
                {
                    if(conn!=null)
                    {
                        conn.close();
                    }
                }
            catch(Exception e)
                {
                    mensaje=mensaje+" "+e.getMessage();
                }
        }
        return mensaje;
    }
    
    public void listarProducto(JTable tabla)
    {
        Connection conn = JdbcUtil.getConnection();
        proDAO.listarProducto(conn,tabla);
        try
        {
            conn.close();
        }
        catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
