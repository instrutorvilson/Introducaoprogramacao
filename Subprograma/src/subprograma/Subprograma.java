/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subprograma;

import java.util.Scanner;

/**
 *
 * @author vilso
 */
public class Subprograma {
    /*subprograma - procedure -> não retorna valor (void)
                  - function  -> retorna valor
   */
    
    static String[] nomes = new String[3];
    
    public static void main(String[] args) {
      digitar();
      
      listar();//invocando o subprograma listar()
    }
    
    public static void digitar(){
       int x = 0;
       while(x < nomes.length){
           System.out.println("Informe um nome ");
           nomes[x] = new Scanner(System.in).nextLine();
           x++;
       }
    }
    
    public static void listar(){
        for(String nome : nomes){
            System.out.println("Nome: " + nome);
        }
    }
    
    
    
}
