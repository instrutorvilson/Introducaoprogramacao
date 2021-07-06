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
       paulo.altura = 1.80f;
       paulo.peso = 90;
       paulo.mostrarDados();
       
       
       Pessoa p2 = new Pessoa();
       p2.nome = "Januario da Silva";
       p2.idade = 80;       
       p2.mostrarDados();
    }
    
}
