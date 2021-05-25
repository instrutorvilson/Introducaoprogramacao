/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorescomparacao;

/**
 *
 * @author vilso
 */
public class OperadoresComparacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* == != < > <= >= */
      int x = 10;
      int y = 10;
      System.out.println(x == y);//logico
      System.out.println(x != y);
      System.out.println(x < y);
      System.out.println(x > y);
      System.out.println(x <= y);//menor (f) OU igual(V) => V
      System.out.println(x >= y);
    }
    
}
