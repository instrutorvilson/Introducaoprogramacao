/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioidadeavancado;

import java.util.Scanner;

public class ExercicioIdadeAvancado {

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
        
        if(idade < 9){
            System.out.println(nome + " você é criança.");  
        }
        else if(idade < 15){
           System.out.println(nome + " você é pré-adolescente."); 
        } else if (idade < 19){
            System.out.println(nome + " você  é adolescente."); 
        }
        else if(idade < 51){
            System.out.println(nome + " você é adulto.");
        }
        else{
            System.out.println(nome + " você está na terceira idade.");
        }
    }

}
