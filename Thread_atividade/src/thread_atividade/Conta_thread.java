/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread_atividade;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;

/**
 *
 * @author Allan
 */
public class Conta_thread  extends Thread{
    private float PI;
    private float raio;
    
    Conta_thread(){
       
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
        ///Tempo
       Date dt = new Date();
       dt.setTime(0);
       
       for(int i=1;i<=10000;i++){
           this.getConta(); 
           System.out.println(i);
        }
          
           System.out.println(dt.getTime());
           
           
    }
            
            
    
    public static void main(String[] args) {
          
          Conta_thread ct = new Conta_thread ();
          ct.start();
      }
    
    
}
