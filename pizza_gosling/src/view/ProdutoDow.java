/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import connection.ConnectionFactory;
//import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Produtos;
import java.util.*;
import J_pane.Painel;

/**
 *
 * @author Allan
 */
public class ProdutoDow {
    
    public Painel ba;
    
    public void Create(Produtos p){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       
             
        try {
            stmt = con.prepareStatement("INSERT INTO tb_pessoas (nome,idade,dt_nacimento,sexo,rg,cpf) VALUES(?,?,?,?,?,?)");
            stmt.setString(1,p.getNome());
            stmt.setInt(2,p.getIdade());
            stmt.setString(3,p.getDt_nacimento());
            stmt.setString(4,p.getSexo());
            stmt.setString(5,p.getRg());
            stmt.setString(6,p.getCpf());
            
                    
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Dados Inseridos com Sucesso");
            
        } 
         
        
          catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao Connectar 1728"+ex); 
             System.err.println("Erro"+ex);
        }
        
        finally{
            
           ConnectionFactory.closeConnection(con, stmt);
        }
       
    
            
    }
    
    /**
     *
     * @return
     */
    public List<Produtos> get_read_selectFrom(){
         
       
      
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
         
       ResultSet rs = null;
       ArrayList<Produtos> produtos = new ArrayList<Produtos>();
       
       
        try {
     
       
            stmt = con.prepareStatement("SELECT * FROM tb_pessoas");
            rs = stmt.executeQuery();
        
            
            
            while(rs.next()){
               Produtos pd = new Produtos();
               pd.setId_pessoas(rs.getInt("id_pessoas"));
               pd.setNome(rs.getString("nome"));
               pd.setIdade(rs.getInt("idade"));
               pd.setDt_nacimento(rs.getString("dt_nacimento"));
               pd.setSexo(rs.getString("sexo"));
               pd.setRg(rs.getString("rg"));
               pd.setCpf(rs.getString("cpf"));
               produtos.add(pd);
            }
        
           
              JOptionPane.showMessageDialog(null,"Seleção Feita com Sucesso");
           
        } 
        
        
        
            
          catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao Connectar 1728"+ex); 
             System.err.println("Erro"+ex);
        }
        
        finally{
            
           ConnectionFactory.closeConnection(con, stmt,rs);
        }
       
        
       
       return produtos;
         
     }
    
    
    
    
    
   
}
