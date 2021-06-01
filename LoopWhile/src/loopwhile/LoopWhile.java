/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopwhile;

import java.util.Scanner;

/**
 *
 * @author vilso
 */
public class LoopWhile {

    /**
     * while -> testa para entrar (true entra) for -> inicialização; teste
     * logico; incremento do while -> teste no final
     */
    public static void main(String[] args) {
      /*
        boolean continuar = true;
        while (continuar) {
            System.out.print("Informe seu nome: ");
            String nome = new Scanner(System.in).nextLine();

            System.out.print("Digitar outro nome [s/n]");
            String opcao = new Scanner(System.in).next();
            continuar = opcao.equalsIgnoreCase("s");
        }
        System.out.println("e a vida continua... ");
      */
        int x = 0;//variavel de controle
        while(x < 10){
           System.out.println("Valor de x: " + x);
           if(x==5)
              x = 10; 
           x++;
        }
        System.out.println("e a vida continua... ");
         
    }

}
