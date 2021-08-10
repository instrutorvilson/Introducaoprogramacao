/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modificadores;

import Entidades.Pessoa;

/**
 *
 * modificadores de acesso:
-> classes: public, abstract, final, default;
-> metodos: public, private, protected, abstract;
-> atributos: public, private, protected, static, final;


https://www.w3schools.com/java/java_modifiers.asp
 */
public class Modificadores {

   
    public static void main(String[] args) {
       Pessoa p = new Pessoa();
       p.nome = "Jose";
       p.idade = 50; 
       //p.cpf = "123";
       p.setCpf("123456.789-10");
       System.out.println("Cpf " + p.getCpf());
       //p.validaCpf("123");
       //Pessoa.id = 10;
      // System.out.println(Pessoa.id);
    }
    
}
