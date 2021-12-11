package Datos.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class JdbcUtil 
{
    //Para conexiones locales el URL no deberia cambiar.
    //Observen que el ultimo nombre que utilizan es el SID que configuran en SQL Developer
    //(podria ser tambien xe para una instalacion local)
    
    public static Connection conn = null;
    
    public static String url = "jdbc:oracle:thin:@localhost:1521:orclcdb";
    
    //Nombre de usuario para la conexion
    public static String user = "system";
    //Contrasenia para conectarse
    public static String password = "oracle";
    
    public static Connection getConnection()
    {
        try {
            conn = DriverManager.getConnection(url, user, password);
            conn.setAutoCommit(false);
            if(conn!=null)
            {
                System.out.println("Conexion exitosa");
            }
            else
            {
                System.out.println("Conexion es erronea");
            }
            
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Conexion erronea");
        }
        return conn;
    }
}
