/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoreslogicos;

/**
 *
 * @author vilso
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* && -> todos devem ser 
            verdadeiro para soma ser verdadeiro
           || -> um verdadeiro torna a sentença verdadeira
        */
        int x = 20;
        int y = 10;
        int z = 30;
        System.out.println(x < y);
        System.out.println(x < z);
        System.out.println((x < y)&&(x<z));//f v -> f 
        System.out.println((x < y)||(x<z));//f v -> v
    }
    
}
