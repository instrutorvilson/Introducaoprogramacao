/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioarray;

import java.util.Scanner;

/**
 *
 * @author vilso
 */
public class ExercicioArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] y = new int[5];
        for (int i = 0; i < y.length; i++) {
            System.out.print("Informe numero inteiro: ");
            y[i] = new Scanner(System.in).nextInt();
        }

        //ordenar vetor
        boolean trocou = true;
        while (trocou) {
            trocou = false;
            for (int i = 0; i < y.length - 1; i++) {
                if (y[i] > y[i + 1]) {
                    int aux = y[i + 1];
                    y[i + 1] = y[i];
                    y[i] = aux;
                    trocou = true;
                }
            }
        }

        //listar vetor ordenado
        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i] + " ");
        }

        /*  System.out.println("interação sem indexador");
       for(int z : y){
          // System.out.println(z);
          if(z % 2 == 0) 
            System.out.println(z + " é par");
          else 
            System.out.println(z + " é impar");
       }
       
       System.out.println("interação com indexador");
       for(int i = 0; i < y.length; i++){
           System.out.print(y[i] + " ");
       }*/
    }

}
