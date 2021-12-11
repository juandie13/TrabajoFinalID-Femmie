/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cllases.BO;

import Clases.Cliente;
import Clases.Telefono;
import DAO.ClienteDAO;
import Datos.util.JdbcUtil;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

public class ClienteBO // Objeto de Negocio
{
    public String mensaje = "";
    public ClienteDAO cliDAO = new ClienteDAO();
    
    public String registrarCliente(Cliente cli)
    {
        Connection conn = JdbcUtil.getConnection();
        
        try 
        {
            mensaje = cliDAO.registrarCliente(conn, cli);
            
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
    
     public String registrarTelefono(Telefono tel)
    {
        Connection conn = JdbcUtil.getConnection();
        
        try 
        {
            mensaje = cliDAO.registrarTelefono(conn, tel);
            
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
    
    
    public String buscarCliente(String DNI)
    {
        Connection conn = JdbcUtil.getConnection();
        
        try 
        {
            mensaje = cliDAO.buscarCliente(conn, DNI);

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
    
        
    public String actualizarCliente(Cliente cli)
    {
        Connection conn = JdbcUtil.getConnection();
        
        try 
        {
            mensaje = cliDAO.actualizarCliente(conn, cli);
            
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
    
     public String actualizarTelefono(Cliente tel)
    {
        Connection conn = JdbcUtil.getConnection();
        
        try 
        {
            mensaje = cliDAO.actualizarTelefono(conn, tel);
            
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
    
    public String eliminarCliente(String DNI)
    {
        Connection conn = JdbcUtil.getConnection();
        
        try 
        {
            mensaje = cliDAO.eliminarCliente(conn, DNI);

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
    
        public String eliminarTelefono(String DNI)
    {
        Connection conn = JdbcUtil.getConnection();
        
        try 
        {
            mensaje = cliDAO.eliminarTelefono(conn, DNI);

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
    
    public void listarCliente(JTable tabla)
    {
        Connection conn = JdbcUtil.getConnection();
        cliDAO.listarCliente(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void listarTelefono(JTable tabla)
    {
        Connection conn = JdbcUtil.getConnection();
        cliDAO.listarTelefono(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
