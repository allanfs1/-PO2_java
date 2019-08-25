/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread_atividade;

/**
 *
 * @author Allan
 */
public class Conta1_thread1  extends Thread{
    private float PI;
    private float raio;
    
    Conta1_thread1(){
        this.PI = 3.1415f;
        System.out.println("Inicar Thread");
        
    }
    
    
    public void Setconta(float raio){
       this.raio = raio;
    }
    
    
    
    public float  getConta(){
       return PI * (raio * raio);
    }
            
       
    
      public void run(){
        for(int i=1;i<1000000;i++){
           this.getConta();
           System.out.println("B");
        }
    }
         
    public static void main(String[] args) {
          
         Conta1_thread1 ct = new Conta1_thread1();
         ct.start();
      }
    
}
