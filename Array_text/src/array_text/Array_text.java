/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_text;

import produto.Produtos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Allan
 */
public class Array_text {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> numero = new ArrayList<String>();
        List<Produtos> produtos = new ArrayList<Produtos>();
        
        Produtos pd = new Produtos();
        pd.setNome("Allan");
        pd.setIdade(23);
        produtos.add(pd);
        pd.setDt_nacimento("2019-06-01");
        pd.setSexo("F");
        
        
        
        List<Produtos> pa = produtos;
        
        for (Produtos produt: pa) {
          System.out.println("Nome: " +produt.getNome());
          System.out.println("Idade: " + produt.getIdade());
          System.out.println("Data: " + produt.getDt_nacimento());
          System.out.println("Sexo: " + produt.getSexo());
          
         
      }
        
        
      String a = "Allan";
      String b = "Allan";
      
      if(!a.equalsIgnoreCase(b)){
         System.out.println("A = B"); 
      }
      
      else
          System.out.println("Não sao iguais");  
      
      
        
        
    }
    
}
