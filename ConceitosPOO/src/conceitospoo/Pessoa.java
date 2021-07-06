/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
  1) - Criar um metodo para verificar 
    se a pessoa é menor de idade;

  2) criar método para verificar se pessoa 
   está no pessoa ideal IMC.
*/
package conceitospoo;

public class Pessoa {

    String nome;
    int idade;
    float peso;
    float altura;

    public void mostrarDados() {
        System.out.println("Nome...: " + this.nome);
        System.out.println("Idade..: " + this.idade);
        System.out.println("Altura.: " + this.altura);
        System.out.println("Peso...: " + this.peso);
        System.out.println("");
    }
}
