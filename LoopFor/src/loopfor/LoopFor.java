/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopfor;

/**
 *
 * @author vilso
 */
public class LoopFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       for(int i = 0; i < 10 ; i++){
           if(i == 4)
             break;  
           System.out.println("valor de i -> " + i);           
       }
       
       //inverso
        System.out.println("=====Inverso======");
       for(int i = 10; i > 0; i--){
         if(i == 4)
           continue;
         
         System.out.println("valor de i -> " + i);   
       }
    }
    
}
