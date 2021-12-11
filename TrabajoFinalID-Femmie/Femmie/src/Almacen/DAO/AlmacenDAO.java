
package Almacen.DAO;


import Clases.Almacen;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class AlmacenDAO 
{
    public String mensaje = "";
    
    public String registrarAlmacen(Connection conn, Almacen alm)
    {
        PreparedStatement pst = null;
        String sql = "INSERT INTO ALMACEN VALUES(?, ?, ?)";
        
        try 
        {
            pst = conn.prepareStatement(sql); // Ejecuta sentencia SQL
            pst.setString(1, alm.getCodAlm());
            pst.setInt(2, alm.getStockReal());
            pst.setInt(3, alm.getCodUsuario());
            mensaje = "REGISTRADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) 
        {
            mensaje = "NO SE REGISTRÓ CORRECTAMENTE \n" + e.getMessage();
        }
        return mensaje;
    }
    
    public String eliminarAlmacen(Connection conn, String COD_ALM)
    {
        PreparedStatement pst = null;
        String sql = "DELETE FROM ALMACEN WHERE COD_ALM = ?";
        
        try 
        {
            pst = conn.prepareStatement(sql); // Ejecuta sentencia SQL
            pst.setString(1, COD_ALM);
            mensaje = "ELIMINADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) 
        {
            mensaje = "NO SE ELIMINÓ \n" + e.getMessage();
        }
        
        return mensaje;
    }
    
    public void listarAlmacen(Connection conn, JTable tabla)
    {
        DefaultTableModel model; // Crea tabla
        
        // Crea columnas
        String [] columnas = {"COD_ALM", "STOCKREAL","COD_USUARIO"};
        model = new DefaultTableModel(null, columnas);
        
        // Crea sentencia SQL
        String sql = "SELECT * FROM ALMACEN";
        
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
                for (int i = 0; i < 3; i++) 
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
