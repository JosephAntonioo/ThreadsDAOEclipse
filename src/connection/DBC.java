package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBC {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/apiteste";    
    private static final String USER = "root";
    private static final String PASS = "ak0p14d0r4";

    public static Connection getConnection() throws ClassNotFoundException{
        try{
        Class.forName(DRIVER);
        return DriverManager.getConnection(URL, USER, PASS);
        }catch (SQLException ex){
            throw new RuntimeException("Erro na conexão: ", ex);
        }

    }

    public static void closeConnection(Connection con){
        try {
            if(con!=null){
                con.close();
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    public static void closeConnection(Connection con, PreparedStatement stnt){
        
        closeConnection(con);
        
        try {
            if(stnt!=null){
                stnt.close();
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stnt, ResultSet rs){
        
        closeConnection(con, stnt);
        
        try {
            if(rs!=null){
                rs.close();
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
