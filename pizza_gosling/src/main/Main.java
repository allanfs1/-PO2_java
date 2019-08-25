/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import J_pane.Painel;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Allan
 */
public class Main  extends JPanel {
    Main(){
        
   
        
       System.err.println("Iniciar Main");
     
       JFrame jf = new JFrame();
       Painel pn = new Painel();
       jf.add(pn);
      
       
       
       jf.setTitle("Menu Pizzaria");
       jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jf.setResizable(false);
       jf.setSize(540,329);
       jf.setVisible(true);
       jf.setLayout(null);
        
    }
    
     public static void main(String[] args) {
        // TODO code application logic here
          Main ma = new Main();
          ListaContatos lc = new ListaContatos();
          lc.criaJanela();
        
      
         
    }
    
    
    
}
