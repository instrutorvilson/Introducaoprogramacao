/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceitosarraydimensional;

/**
 *
 * @author vilso
 */
public class ConceitosArrayDimensional {
 
    public static void main(String[] args) {
//       Arrays unidimensionais   vetor
//       Arrays bidimensionais matizes
         /* int[] x = {10,20,30}; //|10|20|30|
               //indice - indexador
          System.out.println(x[0]);
          System.out.println(x[1]);
          System.out.println(x[2]);
          System.out.println(x.length);*/
          int[] y = new int[5];
          //preencher com valor padrão
//          y[0] = 1;
//          y[1] = 1;
//          y[2] = 1;
//          y[3] = 1;
//          y[4] = 1;

         for(int i = 0; i < y.length; i++){
             y[i] = i * 10;//escrita na posição do vetor
         }
         
         for(int i = 0; i < y.length; i++){
             System.out.println(y[i]);//leitura
         }
          
    }     
    
}
