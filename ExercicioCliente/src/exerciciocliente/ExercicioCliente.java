/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciocliente;

import javax.swing.JOptionPane;

/**
 *
 * @author vilso
 */
public class ExercicioCliente {
 
    
    public static void main(String[] args) {
       ListaClientes lc = new ListaClientes();       
       
       Cliente c = new Cliente("123", "joao", "joao@gmail.com", "456", 200);
       Cliente c1 = new Cliente("456", "Jose", "jose@gmail.com", "456", 200);
       Cliente c2 = new Cliente("456", "Jose", "jose@gmail.com", "456", 200);
       
       
       lc.inserir(c);
       lc.inserir(c1); 
       lc.inserir(c2);
       lc.listaTodos();
       
//       Cliente ca = lc.getClienteByCpf("123");
//       ca.nome = "João da silva";
//       lc.alterar(ca);
//       lc.listaTodos();
       
       
      //  Cliente cd = lc.getClienteByCpf("456");
       // lc.remover(c);
       // lc.listaTodos();
        
    }
    
}
