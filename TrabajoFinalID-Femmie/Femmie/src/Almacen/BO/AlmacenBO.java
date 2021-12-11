
package Almacen.BO;

import Almacen.DAO.AlmacenDAO;
import Clases.Almacen;

import Datos.util.JdbcUtil;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;


public class AlmacenBO 
{
    public String mensaje = "";
    public AlmacenDAO almDAO = new AlmacenDAO();
    
    
    public String registrarAlmacen(Almacen alm)
    {
        Connection conn = JdbcUtil.getConnection();
        
        try 
        {
            mensaje = almDAO.registrarAlmacen(conn, alm);
            
        } catch (Exception e) 
        {
            mensaje = mensaje + " " + e.getMessage();
        }finally
        {
            try {
                if (conn != null) 
                {
                    conn.close();
                }
            } catch (Exception e) 
            {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    
    public String eliminarAlmacen(String COD_ALM)
    {
        Connection conn = JdbcUtil.getConnection();
        
        try 
        {
            mensaje = almDAO.eliminarAlmacen(conn, COD_ALM);

        } catch (Exception e) 
        {
            mensaje = mensaje + " " + e.getMessage();
        }finally
        {
            try {
                if (conn != null) 
                {
                    conn.close();
                }
            } catch (Exception e) 
            {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    
    public void listarAlmacen (JTable tabla)
    {
        Connection conn = JdbcUtil.getConnection();
        almDAO.listarAlmacen(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
