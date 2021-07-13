/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construtores;

import java.util.ArrayList;
import java.util.List;


public class Construtores {

    public static void main(String[] args) {
      /* Pessoa p1 = new Pessoa();
       System.out.print(p1.toString());
       p1.nome = "José";
       p1.idade = 40;
       p1.peso = 90;
       p1.altura = 1.75f;       
       System.out.print(p1.toString());
       */
       Pessoa p2 = new Pessoa("Antonio");
       System.out.println(p2.toString());
       
       Pessoa p3 = new Pessoa("Joao",50);
       System.out.println(p3.toString()); 
       
       Pessoa p4 = new Pessoa("Pedro",15, 65);
       System.out.println(p4.toString());
    }
    
}
