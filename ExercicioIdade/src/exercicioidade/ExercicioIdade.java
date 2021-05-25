/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioidade;

import java.util.Scanner;

/**
 *
 * @author vilso
 */
public class ExercicioIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tela = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = tela.nextLine();
        
        System.out.println("Digite sua idade: ");
        int idade = tela.nextInt();
        if(idade < 18){
            System.out.println(nome + " você é menor de idade");
        }
        else{
          System.out.println(nome + " você é maior de idade");  
        }
    }
    
}
