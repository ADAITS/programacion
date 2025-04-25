package services.bbdd;

import java.sql.*;
import javax.swing.JOptionPane;

public class Database {

   /* static String timeZone = "?sslmode=require";
    static String dbName = "neondb";
    static String host = "ep-curly-tooth-a28thbkq.eu-central-1.aws.neon.tech";
    static int port = 5432;
    static String url = "jdbc:postgres://" + host + ":" + port + "/" + dbName + timeZone;
    static String user = "neondb_owner";
    static String pass = "npg_kNIouFC83iwE";*/
    //static String driver = "com.mysql.cj.jdbc.Driver";
	static String url = "jdbc:postgresql://ep-curly-tooth-a28thbkq.eu-central-1.aws.neon.tech:5432/neondb?sslmode=require";
	
    static Connection conexion;
    static Statement consulta;
    static ResultSet resultado;
    
    public static void conectar() throws Exception {
		//Class.forName(driver) ;
    	Class.forName("org.postgresql.Driver");
    	conexion = DriverManager.getConnection(url, "neondb_owner","npg_kNIouFC83iwE");
        //conexion = DriverManager.getConnection(url, user, pass);
        System.out.println("Base de datos situada en :\n "+url);
        consulta = conexion.createStatement();
    }
    
    public static ResultSet select(String sentencia){
      try {
        resultado = consulta.executeQuery(sentencia);
      }catch(Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage());
        System.out.println("Error: " + sentencia);
      }
      return resultado;
    }
      
    public static void update(String sentencia){
    	try{
    		consulta.executeUpdate(sentencia);
    		System.out.println("Done: " + sentencia);
    	}catch(SQLException e){
    		JOptionPane.showMessageDialog(null, e.getMessage());
    		System.out.println("Error: " + sentencia);
    	} 
    }
    
    public static void cerrar(){
      try{
        consulta.close();
      }catch(Exception e){}
    }
    
}