/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciocliente;

/**
 *
 * @author vilso
 */
public class Cliente {
   String cpf;
   String nome;
   String email;
   String fone;
   float salario;

    public Cliente() {
    }

    public Cliente(String cpf, String nome, String email, String fone, float salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.fone = fone;
        this.salario = salario;
    } 
    
    public boolean validaCpf(){
        return this.cpf.length() == 11;
    }
    
    public float limiteCredito(){
        return this.salario * 0.30f;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cpf=" + cpf + ", nome=" + nome + ", email=" + email + ", fone=" + fone + ", salario=" + salario + '}';
    }
    
    
}
