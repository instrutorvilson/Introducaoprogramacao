/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author vilso
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> listaString = new ArrayList<>();
        boolean continuar = true;
        do{
           String produto = JOptionPane.showInputDialog("Informe um produto - fim para finalizar");
           
           if(!listaString.contains(produto))
              listaString.add(produto);
           
           continuar = !produto.equalsIgnoreCase("fim");
        }while(continuar);
        
        System.out.println(listaString);
            
        String nome = JOptionPane.showInputDialog("Informe objeto que deseja exlcuir");
        int id = listaString.indexOf(nome);
        System.out.println("Id " + id);
        listaString.remove(id);
        System.out.println(listaString);
        
        nome = JOptionPane.showInputDialog("Informe objeto que deseja exlcuir");
        System.out.println(listaString.remove(nome));
        System.out.println(listaString);
        listaString.set(id, nome);
    }
    
}
