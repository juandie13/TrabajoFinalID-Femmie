/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cllases.BO;

import Clases.Pedido;
import Clases.RegistrarProd1;
import DAO.PedidoDAO;
import Datos.util.JdbcUtil;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JTable;


public class PedidoBO {
    public String mensaje = "";
    public PedidoDAO pedDAO = new PedidoDAO();
    

    
    
    public String registrarPedido(Pedido ped)
    {
        Connection conn = JdbcUtil.getConnection();
        
        try 
        {
            mensaje = pedDAO.registrarPedido(conn, ped);
            
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
    
    
    public String registrarPedidoCliente(Pedido ped)
    {
        Connection conn = JdbcUtil.getConnection();
        
        try 
        {
            mensaje = pedDAO.registrarPedidoCliente(conn, ped);
            
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
    
    
    public String registrarProductoCont(RegistrarProd1 prod)
    {
        Connection conn = JdbcUtil.getConnection();
        
        try 
        {
            mensaje = pedDAO.registrarProductoCont(conn, prod);
            
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
    
    
    public String eliminarPedidoCliente(String NUM_PEDIDO)
    {
        Connection conn = JdbcUtil.getConnection();
        
        try 
        {
            mensaje = pedDAO.eliminarPedidoCliente(conn, NUM_PEDIDO);

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
    
    
    
        public String eliminarPedido(String NUM_PEDIDO)
    {
        Connection conn = JdbcUtil.getConnection();
        
        try 
        {
            mensaje = pedDAO.eliminarPedido(conn, NUM_PEDIDO);

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
    public String actualizarPedido(Pedido ped)
    {
        Connection conn = JdbcUtil.getConnection();
        
        try 
        {
            mensaje = pedDAO.actualizarPedido(conn, ped);
            
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
    
     public String actualizarPedidoCliente(Pedido ped)
    {
        Connection conn = JdbcUtil.getConnection();
        
        try 
        {
            mensaje = pedDAO.actualizarPedidoCliente(conn, ped);
            
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

    
    public void listarPedido(JTable tabla)
    {
        Connection conn = JdbcUtil.getConnection();
        pedDAO.listarPedido(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void listarPedidoCliente(JTable tabla)
    {
        Connection conn = JdbcUtil.getConnection();
        pedDAO.listarPedidoCliente(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void listarRegistrarProd(JTable tabla)
    {
        Connection conn = JdbcUtil.getConnection();
        pedDAO.listarRegistrarProd(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
}
