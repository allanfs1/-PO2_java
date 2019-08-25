/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;


import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Allan
 */
public class ConnectionFactory {

  private static final  String DRIVE = "com.mysql.jdbc.Driver";
  private static final  String URL = "jdbc:mysql://localhost:3306/dbpizzaria";
  private static final  String USER = "root";
  private static final  String PASS = "root";
    
  
  public static Connection getConnection(){
      
      try {
          Class.forName(DRIVE);
          return DriverManager.getConnection(URL,USER,PASS);
                     
      } 
          catch (ClassNotFoundException | SQLException ex) {
           throw new RuntimeException("Erro na conexão:",ex);
      }
             
      
  }
  
  
  ConnectionFactory (){
      
      System.out.print("Iniciando DB");
      System.err.println("...");
      
  }
 
  
     public static void closeConnection(Connection con){
      
             try{
               if(con != null) 
                con.close();
             }
             
             catch (SQLException ex) {
              System.err.println("Erro"+ex);
             }
             
     } 
     
  
     public static void closeConnection(Connection con, PreparedStatement stmt){
      
            closeConnection(con);
         
             try{
               if(stmt != null) 
                stmt.close();
             }
             
             catch (SQLException ex) {
                    System.err.println("Erro"+ex);
             }
             
     } 
     
     
     
       public static void closeConnection(Connection con, PreparedStatement stmt,ResultSet rs){
      
            closeConnection(con,stmt);
         
             try{
               if(rs != null) 
                rs.close();
             }
             
             catch (SQLException ex) {
            System.err.println("Erro"+ex);
             }
             
     } 
  
     
  
     
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
      
    
    }
    
    
    
    
}
