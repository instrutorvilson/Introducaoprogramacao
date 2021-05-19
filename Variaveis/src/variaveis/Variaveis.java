/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variaveis;

import java.util.Scanner;

/**
 *
 * @author vilso
 */
///         jdk                            JVM
//.java -> compila -> .class (bytecode) -> interpretado para SO
//pacotes ->
public class Variaveis {
    // variavel -> armazenar dados a serem manipulados
    // tipo de dado nome variavel
    // = -> atribuição de valor para uma variavel
    public static void main(String[] args) {
       /* int x = 2 + 2;
         Integer y;
         System.out.println(x);
         System.out.println(x + 2);
        */
        /*   
        String nome = "Carlos Caramujo"; 
        System.out.println(nome);
        System.out.println(nome.toUpperCase());
        System.out.println(nome.contains("Jose"));
        */
        //float  4bytes
        //double 8bytes
        //float preco = 10.5f;
        
//        /*int -> 4bytes*/
//        int myInt = 9; 
//        /*double -> 8 bytes*/
//        double myDouble = myInt; //casting automatico (implicito)
//        System.out.println(myDouble);
        
//        float myDouble = 9.78f;
//        int myInt = (int) myDouble;
//        System.out.println(myInt);
/*==================================================*/
        /* Entrada de dados */
        /*criar uma variavel para armazenar altura*/
        /*criar uma variavel para armazenar peso*/
     /*   Scanner tela = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = tela.nextLine();
        
        System.out.print("Digite idade: ");
        int idade = tela.nextInt();
        
        System.out.print("Digite altura: ");
        float altura = tela.nextFloat();
        
        System.out.print("Digite peso: ");
        float peso = tela.nextFloat();
        
        System.out.println("Seu nome é " + nome 
                + " e tem " + idade + " anos.");
        System.out.println("Sua altura é: " + altura);
        System.out.println("Seu peso é: " + peso);
     */
     /*Conversão de tipos*/
     /*String para inteiro -> Integer.parseInt("10")*/
     /*String para float -> Float.parseFloat("10")*/
     /*String para double -> Double.parseDouble("10")*/
        char sexo = 'M';
        String preco = "10";
        int precoInt = Integer.parseInt(preco); 
        String qtde = "15";
        float qtdeFloat = Float.parseFloat(qtde);
        double desconto = Double.parseDouble("0.5");
        System.out.println((precoInt * qtdeFloat) * desconto);
    }
    
}
