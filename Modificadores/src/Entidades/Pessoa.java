/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author vilso
 */
public class Pessoa {
   public  String nome;
   public  int idade = 45;
   public static int id;
   private String user;
   final String senha = "123";
   
   //encapsulamento
   private String cpf;
   
   //escrita no atributo private
   public void setCpf(String pCpf){
        if(validaCpf(pCpf)) 
           this.cpf = pCpf;
   }
   //leitura no atributo private
   public String getCpf(){
       return this.cpf;
   }
   
   private boolean validaCpf(String cpf){
       if(cpf.length() != 14){
          JOptionPane.showMessageDialog(null, "cpf inválido");
          return false;
       }
       return true;
   }
   
   public Pessoa(){
       this.user = "123";
   }
   
   
}
