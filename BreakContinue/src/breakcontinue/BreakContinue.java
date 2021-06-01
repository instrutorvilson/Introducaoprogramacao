/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakcontinue;

/**
 *
 * @author vilso
 */
public class BreakContinue {

    /**
     * @param args the command line arguments
     * break -> promove a saida do looping
     * continue -> promove a saida somente da execução
     */
    public static void main(String[] args) {
        int x = 0;
        while(x < 10){
            x++;
            if(x == 4)
              //continue;
                break;
            
            System.out.println("Valor de x " + x);           
        }
    }
    
}
