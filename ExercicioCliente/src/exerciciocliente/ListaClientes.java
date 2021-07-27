/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciocliente;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author vilso
 */
public class ListaClientes {
    List<Cliente> lista = new ArrayList<>();
    
    public void inserir(Cliente c){
       // if(lista.contains(c))
       if (registroExiste(c))
          JOptionPane.showMessageDialog(null, "Cliente já cadastrado"); 
        else
           lista.add(c);            
    }
    
    public void alterar(Cliente c){
        if(lista.indexOf(c) != -1)
            lista.set(lista.indexOf(c), c);
    }
    
    public Cliente getClienteByCpf(String cpf){
       for(Cliente cli : lista){
            if(cli.cpf.equalsIgnoreCase(cpf))
                return cli;
        } 
       return null;
    }
    
    public boolean remover(Cliente c){
        return lista.remove(c);
    }
    
    public void listaTodos(){
        for(Cliente cli : lista){
            System.out.println(cli.toString());
        }
    }
    
    private boolean registroExiste(Cliente c){
        for(Cliente cli : lista){
            if(c.cpf.equalsIgnoreCase(cli.cpf))
                return true;
        }
        return false;
    }
    
    
}
