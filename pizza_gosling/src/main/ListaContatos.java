/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Allan
 */

    
import java.awt.GridLayout;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import model.Produtos;
import view.ProdutoDow;
  
/**
 * @author Rosicléia Frasson
 */
public class ListaContatos  extends JFrame {
    JPanel painelFundo;
    JTable tabela;
    JScrollPane barraRolagem;
    
    Produtos p = new Produtos();
    ProdutoDow dao = new ProdutoDow ();
    List<Produtos> pa = dao.get_read_selectFrom();
   
    
    Object [][] dados1 = {
        {pa.get(0).getNome(), pa.get(0).getIdade(), pa.get(0).getSexo(),pa.get(0).getCpf()},
        {pa.get(1).getNome(), pa.get(1).getIdade(), pa.get(1).getSexo(),pa.get(1).getCpf()},
        {pa.get(2).getNome(), pa.get(2).getIdade(), pa.get(2).getSexo(),pa.get(2).getCpf()},
        {pa.get(3).getNome(), pa.get(2).getIdade(), pa.get(3).getSexo(),pa.get(3).getCpf()},
        {pa.get(4).getNome(), pa.get(4).getIdade(), pa.get(4).getSexo(),pa.get(4).getCpf()}
    };
     
    String [] colunas = {"Nome", "idade", "sexo","cpf"}; 
     

    public ListaContatos() {
        super ("Contatos-novos");
        
    }
    
    
    
 
    
    public  Object listar(){
        
    Produtos p = new Produtos();
    ProdutoDow dao = new ProdutoDow ();
    List<Produtos> pa = dao.get_read_selectFrom();
   
    
           
    for(int i=0;i<pa.size();i++){
     Object  dados [][] = {
     {pa.get(i).getNome(),pa.get(i).getIdade(),pa.get(i).getSexo(),pa.get(i).getCpf()}
        }; 
     
      System.out.println(pa.get(i).getNome());
      System.out.println(pa.get(i).getIdade());
      System.out.println(pa.get(i).getSexo());
      System.out.println(pa.get(i).getCpf());
     
    }
        
     return "A";
}
    
     
    public void criaJanela(){
       
        painelFundo = new JPanel();
        painelFundo.setLayout(new GridLayout(1, 1));
        tabela = new JTable(dados1,colunas);
        barraRolagem = new JScrollPane(tabela);
        painelFundo.add(barraRolagem); 
         
        getContentPane().add(painelFundo);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 150);
        setVisible(true);
    }
     
    public static void main(String[] args) {
        ListaContatos lc = new ListaContatos();
        lc.criaJanela();
        
    
        }
        
    }
    
    
    
    
    



    
    
    

