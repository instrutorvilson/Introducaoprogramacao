/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecaolist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vilso
 */
public class ColecaoList {

    public static void main(String[] args) {
        String nome;
        String[] nomes = {"joao", "Jose"};

       // ArrayList<String> cars = new ArrayList<String>();
        List<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Corsa");
        
        System.out.println(cars);
        System.out.println(cars.get(1));
        cars.set(1, "Jeep");
        System.out.println(cars);
        System.out.println(cars.contains("Jeep"));
        System.out.println(cars.indexOf("Jeep"));
       
    }

}
