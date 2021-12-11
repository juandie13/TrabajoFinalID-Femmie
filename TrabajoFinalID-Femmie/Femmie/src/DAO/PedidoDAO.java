/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Clases.Pedido;
import Clases.RegistrarProd1;
import Datos.util.JdbcUtil;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PedidoDAO {
      public String mensaje = "";
    
    public String registrarPedido(Connection conn, Pedido ped)
    {
        PreparedStatement pst = null;
        
        String sql = "INSERT INTO PEDIDO VALUES(?, ?, ?,?,?)";
        try 
        {
            pst = conn.prepareStatement(sql); // Ejecuta sentencia SQL
            pst.setString(1, ped.getNumPedido());
            pst.setString(2, ped.getNumPromocion());
            pst.setString(3, ped.getCodDelivery());    
            pst.setString(4, ped.getFechaRegistro());
            pst.setString(5, ped.getFechaEntrega());
            
          
            
            mensaje = "PEDIDO REGISTRADO CORRECTAMENTE";
            pst.execute();
            pst.close();
           
        } catch (SQLException e) 
        {
            mensaje = "NO SE REGISTRO CORRECTAMENTE \n" + e.getMessage();
        }
        return mensaje;
    }
    
    public String registrarPedidoCliente(Connection conn, Pedido ped)
    {
        PreparedStatement pst = null;
      
        
        String sql = "INSERT INTO REALIZAR_PEDIDO VALUES(?, ?, ?,?,?)";
       
        try 
        {
           
            
            pst = conn.prepareStatement(sql); 
            pst.setString(1, ped.getNumPedido());
            pst.setString(2, ped.getDni());
            pst.setString(3, ped.getEstadoPedido());    
            pst.setString(4, ped.getTarjeta());
            pst.setString(5, ped.getNumeroTarjeta() );
            
            mensaje = "PEDIDO REGISTRADO CORRECTAMENTE";
            pst.execute();
            pst.close();
          
            
        } catch (SQLException e) 
        {
            mensaje = "NO SE REGISTRO CORRECTAMENTE \n" + e.getMessage();
        }
        return mensaje;
    }
    
    public String registrarProductoCont(Connection conn, RegistrarProd1 prod)
    {
        PreparedStatement pst = null;
        String sql = "INSERT INTO CONT_PROD VALUES(?, ?, ?)";
       
        try 
        {
            pst = conn.prepareStatement(sql); 
            pst.setString(1, prod.getNumPedido());
            pst.setString(2, prod.getSKU());
            pst.setInt(3, prod.getCantidad());    

            
            mensaje = "PRODUCTO REGISTRADO CORRECTAMENTE";
            pst.execute();
            pst.close();
          
            
        } catch (SQLException e) 
        {
            mensaje = "NO SE REGISTRO CORRECTAMENTE \n" + e.getMessage();
        }
        return mensaje;
    }
    
    
    public String eliminarPedido(Connection conn, String NUM_PEDIDO)
    {
        PreparedStatement pst = null;
        
        String sql = "DELETE FROM PEDIDO WHERE NUM_PEDIDO = ?";
        
        try 
        {
            
            pst = conn.prepareStatement(sql); // Ejecuta sentencia SQL
            pst.setString(1, NUM_PEDIDO);
            mensaje = "ELIMINADO CORRECTAMENTE";
            
            pst.execute();
            pst.close();
           
            
        } catch (SQLException e) 
        {
            mensaje = "NO SE ELIMINÓ \n" + e.getMessage();
        }
        
        return mensaje;
    }
    
    public String actualizarPedido(Connection conn, Pedido ped)
    {
        PreparedStatement pst = null;
        String sql = "UPDATE PEDIDO SET NUM_PEDIDO = ? ,COD_PROMOCION = ?, COD_DELIVERY = ?, FECHA_REGISTRO = ? , FECHA_ENTREGA = ?"
                    + "WHERE NUM_PEDIDO = ?";
        
        try 
        {
            pst = conn.prepareStatement(sql); // Ejecuta sentencia SQL
            pst.setString(1, ped.getNumPedido());
            pst.setString(2, ped.getNumPromocion());
            pst.setString(3, ped.getCodDelivery());    
            pst.setString(4, ped.getFechaRegistro());
            pst.setString(5, ped.getFechaEntrega());
          
            mensaje = "ACTUALIZADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) 
        {
            mensaje = "NO SE ACTUALIZÓ CORRECTAMENTE \n" + e.getMessage();
        }
        
        return mensaje;
    }
    
    
     public String actualizarPedidoCliente(Connection conn, Pedido ped)
    {
        PreparedStatement pst = null;
        String sql = "UPDATE REALIZAR_PEDIDO SET NUM_PEDIDO = ?, DNI = ?, ESTADO_PEDIDO = ?, TARJETA = ? , N_CUENTA = ?"
                    + "WHERE NUM_PEDIDO = ?";
        
        try 
        {
            pst = conn.prepareStatement(sql); // Ejecuta sentencia SQL
            pst.setString(1, ped.getNumPedido());
            pst.setString(2, ped.getDni());
            pst.setString(3, ped.getEstadoPedido());    
            pst.setString(4, ped.getTarjeta());
            pst.setString(5, ped.getNumeroTarjeta() );
          
            mensaje = "ACTUALIZADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) 
        {
            mensaje = "NO SE ACTUALIZÓ CORRECTAMENTE \n" + e.getMessage();
        }
        
        return mensaje;
    }
    
    public String eliminarPedidoCliente(Connection conn, String NUM_PEDIDO)
    {
        PreparedStatement pst = null;
        
        String sql = "DELETE FROM REALIZAR_PEDIDO WHERE NUM_PEDIDO = ?";
        
        try 
        {
           
            
            pst = conn.prepareStatement(sql); // Ejecuta sentencia SQL
            pst.setString(1, NUM_PEDIDO);
            mensaje = "ELIMINADO CORRECTAMENTE";
            
            pst.execute();
            pst.close();
           
            
        } catch (SQLException e) 
        {
            mensaje = "NO SE ELIMINÓ \n" + e.getMessage();
        }
        
        return mensaje;
    }
    
    
    public void listarPedidoCliente(Connection conn, JTable tabla)
    {
        DefaultTableModel model; // Crea tabla
        
       
        String [] columnas = {"NUM_PEDIDO", "DNI", "ESTADO DEL PRODUCTO","TARJETA","N° CUENTA"};

        model = new DefaultTableModel(null, columnas);
        
        // Crea sentencia SQL
        String sql = "SELECT * FROM REALIZAR_PEDIDO ";
        String [] filas = new String[5];
        Statement st = null; // Ejecuta el query
        ResultSet rs = null; // Obtiene el resultado del query
       
 
        
        // Muestra datos en la tabla
        try 
        {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
          
            while (rs.next()) 
            {                
                for (int i = 0; i <5 ; i++) 
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
    
    
    public void listarRegistrarProd(Connection conn, JTable tabla)
    {
        DefaultTableModel model; // Crea tabla
        
       
        String [] columnas = {"NUM_PEDIDO", "SKU", "CANTIDAD"};

        model = new DefaultTableModel(null, columnas);
        
        // Crea sentencia SQL
        String sql = "SELECT * FROM CONT_PROD";
        String [] filas = new String[3];
        Statement st = null; // Ejecuta el query
        ResultSet rs = null; // Obtiene el resultado del query
       
 
        
        // Muestra datos en la tabla
        try 
        {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
           
            while (rs.next()) 
            {                
                for (int i = 0; i <3 ; i++) 
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
    
    
    
      public void listarPedido(Connection conn, JTable tabla)
    {
        DefaultTableModel model; // Crea tabla
        
       
        String [] columnas = {"NUM_PEDIDO", "NUM_PROMOCION", "COD_DELIVERY","Fecha_Registro","Fecha entrega"};

        model = new DefaultTableModel(null, columnas);
        
       String sql = "SELECT * FROM PEDIDO";
       
        String [] filas = new String[5];
        Statement st = null; // Ejecuta el query
        ResultSet rs = null; // Obtiene el resultado del query
   

        
        
        // Muestra datos en la tabla
        try 
        {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
           
            while (rs.next()) 
            {                
                for (int i = 0; i <5 ; i++) 
                {
                    String x = rs.getString(i+1); 
                    if ( i == 3 || i == 4) {
                        //System.out.println(x);
                        
                        String fecha = x;
                        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
                        SimpleDateFormat format2 = new SimpleDateFormat("dd-MM-yyyy");
                        fecha = format2.format(format1.parse(fecha));
                        filas[i] = fecha;
                    }else{
                        // Guarda datos en las filas
                         filas[i] = rs.getString(i+1);
                    }                    
                    
                    
                }
                model.addRow(filas); // Agrega datos a las filas
            }
            tabla.setModel(model); // Ejecuta el modelo
            
            
            
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "No es posible mostrar la tabla.");
        }
    }
      
    public  String obtenerMonto(String codPedido) throws Exception{
        int respuesta;
        Connection conn = JdbcUtil.getConnection();
        String llamado = "{call ? := PRECIO_FINAL(?)}";
         try 
        {
           CallableStatement cst = conn.prepareCall(llamado);
           cst.setString(2, codPedido);
        
           cst.registerOutParameter(1, Types.FLOAT);
           cst.execute();
           respuesta = cst.getInt(1);
           mensaje = "El monto del pedido es "+ Integer.toString(respuesta) + " soles";
        
           cst.close();
           conn.close();
         } catch (SQLException e) 
        {
            mensaje = "Numero de de Pedido incorrecto \n";
        }   
           
        return mensaje;
    } 
      
    
}
