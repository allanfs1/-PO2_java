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
public class Conta_thread2  extends Thread{
    private float PI;
    private float raio;
    
    Conta_thread2(){
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
           System.out.println("C");
        }
    }
         
    
     public static void main (String args[]){ //método principal
          
         Conta_thread2  ct = new Conta_thread2();
         ct.start();
          
      }
    
    
    
    
}
