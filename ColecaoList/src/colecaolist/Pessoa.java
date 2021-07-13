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
package colecaolist;

public class Pessoa {
    String nome;
    int idade;
    float peso;
    float altura;

    //método construtor deve ter o mesmo nome da classe
    //não tem tipo de retorno, nem void
    public Pessoa(String nome){
       this.nome = nome; 
    }
    
    public Pessoa(String nome, int idade){
      this.nome = nome;
      this.idade = idade;
    }
    
    public Pessoa(String nome, int idade, float peso){
       this.nome = nome;
       this.idade = idade;
       this.peso = peso;
    }

    public Pessoa(String nome, int idade, float peso, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
        
    public Pessoa(){
        //
    }
    
    
    public void mostrarDados() {
        System.out.println("Nome...: " + this.nome);
        System.out.println("Idade..: " + this.idade);
        System.out.println("Altura.: " + this.altura);
        System.out.println("Peso...: " + this.peso);
        System.out.println(this.verificaIdade());
        calculaPeso();
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + 
                ", idade=" + idade + 
                ", peso=" + peso + 
                ", altura=" + altura + '}';
    }
    
    public String verificaIdade() {
        if (this.idade < 18) {
            return " menor de idade";
        } else {
            return " maior de idade";
        }
    }

    public void calculaPeso() {
        float imc = (this.peso) / (this.altura * this.altura);
        if ((imc >= 18.5) && (imc <= 29.4)) {
            System.out.println(this.nome + ", você está no IMC ideal\n");
        } else if (imc > 29.4) {
            System.out.println(this.nome + ", vocÊ está com sobrepeso\n");
        } else if (imc < 18.5) {
            System.out.println(this.nome + ", você está com magreza\n");
        }
    }

}
