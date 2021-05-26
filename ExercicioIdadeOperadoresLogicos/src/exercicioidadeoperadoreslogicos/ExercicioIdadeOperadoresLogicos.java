/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioidadeoperadoreslogicos;

import java.util.Scanner;

/**
 *
 * @author vilso
 */
public class ExercicioIdadeOperadoresLogicos {

   /*
        - até 8 anos: Criança;
        - acima de 8 e até 14: pré-adolescente;
        - acima de 14 e até 18: adolescente;
        - acima de 18 e até 50: adulto;
        - acima de 50: terceira idade
     */
    public static void main(String[] args) {
       Scanner tela = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = tela.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = tela.nextInt();
        
        if(idade <= 8)
          System.out.println(nome + " voce é crianca");
        
        if((idade > 8)&&(idade<15))
          System.out.println(nome + " voce é pré-adolescente");
        
        if(idade>15 && idade<=18)
           System.out.println(nome + " voce é adolescente");
        
        if(idade>18 && idade<=50)
           System.out.println(nome + " voce é adulto");
        
        if(idade>50)
          System.out.println(nome + " voce é da terceira idade");
    }
    
}
