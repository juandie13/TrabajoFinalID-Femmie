/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.Cliente;
import Clases.Telefono;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ClienteDAO // Datos de la BD
{
    public String mensaje = "";
    
    public String registrarCliente(Connection conn, Cliente cli)
    {
        PreparedStatement pst = null;
        
        String sql = "INSERT INTO CLIENTE VALUES(?, ?, ?, ?)";
        
        try 
        {
            pst = conn.prepareStatement(sql); // Ejecuta sentencia SQL
            pst.setString(1, cli.getDNI());
            pst.setString(2, cli.getNombre());
            pst.setString(3, cli.getCorreo());
            pst.setString(4, cli.getDireccion());
            
            
            //pst.setInt(5, cli.getTelefono_Cliente());
            mensaje = "GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) 
        {
            mensaje = "NO SE GUARDÓ CORRECTAMENTE \n" + e.getMessage();
        }
        return mensaje;
    }
    public String registrarTelefono(Connection conn, Telefono tel)
    {
        PreparedStatement pst = null;
        
        String sql = "INSERT INTO TELEFONO VALUES(?, ?)";
        
        try 
        {
            pst = conn.prepareStatement(sql); // Ejecuta sentencia SQL
            pst.setString(1, tel.getDNI());
            pst.setString(2, tel.getTelefono_Cliente());
            
            
            
            //pst.setInt(5, cli.getTelefono_Cliente());
            mensaje = "GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) 
        {
            mensaje = "NO SE GUARDÓ CORRECTAMENTE \n" + e.getMessage();
        }
        return mensaje;
    }
    
    
    public String buscarCliente(Connection conn, String DNI)
    {
        PreparedStatement pst = null;
        String sql = "SELECT * FROM CLIENTE WHERE DNI = ?";
        
        try 
        {
            pst = conn.prepareStatement(sql); // Ejecuta sentencia SQL
            pst.setString(1, DNI);
            
            mensaje = "CLIENTE ENCONTRADO";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) 
        {
            mensaje = "NO SE ENCONTRÓ CLIENTE. \n" + e.getMessage();
        }
        
        return mensaje;
    }
    
        
    public String actualizarCliente(Connection conn, Cliente cli)
    {
        PreparedStatement pst = null;
        String sql = "UPDATE CLIENTE SET NOMBRE = ?, CORREO = ?, DIRECCION = ?"
                    + "WHERE DNI = ?";
        
        try 
        {
            pst = conn.prepareStatement(sql); // Ejecuta sentencia SQL
            pst.setString(1, cli.getNombre());
            pst.setString(2, cli.getCorreo());
            pst.setString(3, cli.getDireccion());
            pst.setString(4, cli.getDNI());
            mensaje = "ACTUALIZADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) 
        {
            mensaje = "NO SE ACTUALIZÓ CORRECTAMENTE \n" + e.getMessage();
        }
        
        return mensaje;
    }
     public String actualizarTelefono(Connection conn, Cliente tel)
    {
        PreparedStatement pst = null;
        String sql = "UPDATE TELEFONO SET  TELEFONO_CLIENTE = ? WHERE DNI = ?";
        
        try 
        {
            pst = conn.prepareStatement(sql); // Ejecuta sentencia SQL
    
            pst.setString(1, tel.getDNI());
            pst.setString(2, tel.getTelefono());
            mensaje = "ACTUALIZADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) 
        {
            mensaje = "NO SE ACTUALIZÓ CORRECTAMENTE \n" + e.getMessage();
        }
        
        return mensaje;
    }
    public String eliminarCliente(Connection conn, String DNI)
    {
        PreparedStatement pst = null;
        String sql = "DELETE FROM CLIENTE WHERE DNI = ?";
        
        try 
        {
            pst = conn.prepareStatement(sql); // Ejecuta sentencia SQL
            pst.setString(1, DNI);
            mensaje = "ELIMINADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) 
        {
            mensaje = "NO SE ELIMINÓ \n" + e.getMessage();
        }
        
        return mensaje;
    }
    public String eliminarTelefono(Connection conn, String DNI)
    {
        PreparedStatement pst = null;
        String sql = "DELETE FROM TELEFONO WHERE DNI = ?";
        
        try 
        {
            pst = conn.prepareStatement(sql); // Ejecuta sentencia SQL
            pst.setString(1, DNI);
            mensaje = "ELIMINADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) 
        {
            mensaje = "NO SE ELIMINÓ \n" + e.getMessage();
        }
        
        return mensaje;
    }
    
    
    public void listarCliente(Connection conn, JTable tabla)
    {
        DefaultTableModel model; // Crea tabla
        
        // Crea columnas
        String [] columnas = {"DNI", "NOMBRE", "CORREO", "DIRECCION"};
        model = new DefaultTableModel(null, columnas);
        
        // Crea sentencia SQL
        String sql = "SELECT * FROM CLIENTE";
        
        String [] filas = new String[4];
        Statement st = null; // Ejecuta el query
        ResultSet rs = null; // Obtiene el resultado del query
        
        // Muestra datos en la tabla
        try 
        {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) 
            {                
                for (int i = 0; i < 4; i++) 
                {
                    // Guarda datos en las filas
                    filas[i] = rs.getString(i+1);
                }
                model.addRow(filas); // Agrega datos a las filas
            }
            tabla.setModel(model); // Ejecuta el modelo
            
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "No es posible mostrar la tabla.");
        }
    }
    public void listarTelefono(Connection conn, JTable tabla)
    {
        DefaultTableModel model; // Crea tabla
        
        // Crea columnas
        String [] columnas = {"DNI", "TELEFONO_CLIENTE"};
        model = new DefaultTableModel(null, columnas);
        
        // Crea sentencia SQL
        String sql = "SELECT * FROM TELEFONO";
        
        String [] filas = new String[2];
        Statement st = null; // Ejecuta el query
        ResultSet rs = null; // Obtiene el resultado del query
        
        // Muestra datos en la tabla
        try 
        {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) 
            {                
                for (int i = 0; i < 2; i++) 
                {
                    // Guarda datos en las filas
                    filas[i] = rs.getString(i+1);
                }
                model.addRow(filas); // Agrega datos a las filas
            }
            tabla.setModel(model); // Ejecuta el modelo
            
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "No es posible mostrar la tabla.");
        }
    }
}
