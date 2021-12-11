package DAO;

import Clases.Producto;
import static Datos.util.JdbcUtil.conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import static oracle.sql.NUMBER.e;

public class ProductoDAO 
{
    private String mensaje="";
    
    public String agregarProducto(Connection conn, Producto pro)
    {
        PreparedStatement pst = null;
        String sql = "INSERT INTO PRODUCTO VALUES(?,?,?,?,?,?,?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setString(1,pro.getSKU());
            pst.setString(2,pro.getSeccion());
            pst.setString(3,pro.getCategoria());
            pst.setString(4,pro.getLinea());
            pst.setString(5,pro.getModelo());
            pst.setString(6,pro.getColor());
            pst.setString(7,pro.getMedida());
            pst.setInt(8,pro.getPrecioUnitario());
            mensaje=" PRODUCTO GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        }
        catch(SQLException e)
        {
            mensaje = "NO SE REGISTRO CORRECTAMENTE \n" + e.getMessage();
        }
        return mensaje;
    }
    
    public String modificarProducto(Connection conn, Producto pro)
    {
        PreparedStatement pst = null;
        String sql = "UPDATE PRODUCTO SET SECCION=?,CATEGORIA=?,LINEA=?,MODELO=?,COLOR=?,MEDIDA=?,PRECIO_UNITARIO=?"
                +"WHERE SKU=?";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setString(1,pro.getSeccion());
            pst.setString(2,pro.getCategoria());
            pst.setString(3,pro.getLinea());
            pst.setString(4,pro.getModelo());
            pst.setString(5,pro.getColor());
            pst.setString(6,pro.getMedida());
            pst.setInt(7,pro.getPrecioUnitario());
            pst.setString(8,pro.getSKU());
            pst.execute();
            mensaje="MODIFICADO CORRECTAMENTE";
            pst.close();
        }
        catch(SQLException e)
        {
            mensaje = "NO SE MODIFICO CORRECTAMENTE \n" + e.getMessage();
        }
        return mensaje;
    }
    
    public String eliminarProducto(Connection conn, int sku)
    {
        PreparedStatement pst = null;
        String sql = "DELETE FROM PRODUCTO WHERE SKU = ?";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1,sku);
            mensaje = "ELIMINADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        }
        catch(SQLException e)
        {
            mensaje = "NO SE ELIMINÓ CORRECTAMENTE \n" + e.getMessage();
        }
        return mensaje;
    }
    
    public void listarProducto(Connection conn, JTable tabla)
    {
        DefaultTableModel model;
        String[] columnas = {"SKU","Sección","Categoría","Línea","Modelo","Color","Medida","Precio_Unitario"};
        model = new DefaultTableModel(null,columnas);
        
        String sql = "Select * from producto order by sku";
        
        String[] filas = new String[8];
        Statement st = null;
        ResultSet rs = null;
        try
        {
            st=conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next())
            {
                for(int i=0;i<8;i++)
                {
                    filas[i]=rs.getString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"NO SE PUEDE MOSTRAR LA TABLA");
        }
    }
}
