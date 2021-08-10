/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

import entidades.Animal;
import entidades.Ave;
import entidades.Mamifero;

/**
 *
 * @author vilso
 */
public class Heranca {

    /**
     * https://www.w3schools.com/java/java_inheritance.asp
     */
    public static void main(String[] args) {
        Animal animal = new Animal();
       // animal.raca = "cachorro";
        //animal.especie = "xauxau";
        animal.sound("Som do animal");
        
        Mamifero mamifero = new Mamifero();
        //mamifero.raca = "nelore";
       // mamifero.especie = "bovina";
        mamifero.setRaca("nelore");
        mamifero.mamas = 4;
        mamifero.sound("som do mamifero");
        System.out.println(mamifero.getRaca());
        
        Ave ave = new Ave();
        ave.coloracaoPenas = "esverdeada";
        
    }
    
}
