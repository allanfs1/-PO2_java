/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread_atividade;

import java.util.Scanner;


/**
 *
 * @author Allan
 */

public class Thread_atividade  extends Thread{
      private Conta_thread ci; 
    
    /**
     * @param args the command line arguments
     */
    
   
      
    public void  get_run(){
        
    } 
      
     
   
    private void setConta(Conta_thread ci){
        this.ci = ci;
        
    }
            
     private Conta_thread GetConta(){
        return  ci;
    }
             
    @Override
    public void run(){
            
            
    }
      
   
    public static void main(String[] args) {
          // TODO code application logic here
      float valor;
      Thread_atividade obj = new Thread_atividade();
      Conta_thread ct = new Conta_thread();
      Conta1_thread1 ct1 = new Conta1_thread1();
      Conta_thread2 ct2 = new Conta_thread2();
    
      Scanner  scan = new Scanner(System.in);
      System.out.print("Entre com Raio:");
      valor=scan.nextFloat();
 
      //set
      ct.Setconta(valor);ct1.Setconta(valor);ct2.Setconta(valor);
      obj.setConta(ct);
      
     
      
     // System.out.println("A"+obj.GetConta().getConta());
     // System.out.println("B:"+ct1.getConta());
    //  System.out.println("C"+ct2.getConta());
      
    
      ct.start();//Thead  1
      ct1.start();//Thead 2
      ct2.start();//Thead 3
       
         
        
    }
    
}
