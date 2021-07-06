/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceitospoo;

public class ConceitosPOO {

    public static void main(String[] args) {
       //instanciar o objeto
       Pessoa paulo = new Pessoa();
       paulo.nome = "Paulo da Silva";
       paulo.idade = 50;
       
       System.out.println(paulo.nome);
       System.out.println(paulo.idade);
       
       Pessoa p2 = new Pessoa();
       p2.nome = "Januario da Silva";
       p2.idade = 80;
       
       System.out.println(p2.nome);
       System.out.println(p2.idade);
    }
    
}
