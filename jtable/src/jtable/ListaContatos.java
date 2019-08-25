/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtable;

/**
 *
 * @author Allan
 */

    
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
 
/**
 * @author Rosicléia Frasson
 */
public class ListaContatos  extends JFrame {
    JPanel painelFundo;
    JTable tabela;
    JScrollPane barraRolagem;
        
    
    int [][] da = { {1,1},{2,3} };
  
    Object [][] dados = {
        {"Ana Monteiro", "48 9923-7898", "ana.monteiro@gmail.com","null"},
        {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com","null"},
        {"Pedro Cascaes", "48 9870-5634", "pedrinho@gmail.com","null"}
    };
     
    String [] colunas = {"Nome", "Telefone", "Email","Novo"}; 
     

    public ListaContatos() {
        super ("Contatos-novos");
         System.err.println(da[1][0]);
    }
     
    public void criaJanela(){
         
        painelFundo = new JPanel();
        painelFundo.setLayout(new GridLayout(1, 1));
        tabela = new JTable(dados, colunas);
        barraRolagem = new JScrollPane(tabela);
        painelFundo.add(barraRolagem); 
         
        getContentPane().add(painelFundo);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 120);
        setVisible(true);
    }
     
    public static void main(String[] args) {
        ListaContatos lc = new ListaContatos();
        lc.criaJanela();
        
    }
}
    
    
    

