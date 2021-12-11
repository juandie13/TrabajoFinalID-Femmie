
package Datos.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;


public class Procedure 
{
    
    public static String procedure(int DNI, String nombre, String correo, String direccion) throws SQLException
    {
        String resultado = null;
        try {
            Connection conn = JdbcUtil.getConnection();

            CallableStatement st = conn.prepareCall(" CALL MOSTRAR_DATOS(?)");
            st.setInt(1, DNI);
            //st.setString("Nombre", nombre);
            //st.setString("Correo", correo);
            //st.setString("Direccion", direccion);

            st.registerOutParameter("Resultado: ", Types.VARCHAR);
            st.execute();
            resultado = st.getString(resultado);
            } catch (Exception e) {
                System.out.println(e);
        }
        return resultado;
    }
    
    public static void main(String[] args) throws SQLException 
    {
        JdbcUtil db = new JdbcUtil();
        String r = procedure(73112007, "ALISSON", "AL.GALLARDO@GMAIL.COM", "AV. PERU - COMAS");
        System.out.println(r);
    }
}
