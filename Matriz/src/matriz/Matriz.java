/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

/**
 *
 * @author vilso
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome = "Vilson"; //variavel com somente uma referencia de memória
        String[] nomes = new String[5];//array -> vetor que particiona e 5 referencias de memoria
        // | | | | | | |
        
        for(int i = 0; i < nomes.length; i++){
            nomes[i] = "c " + i;
        }
        listarVetor(nomes);
        
        
        String[][] grade = new String[3][5];
        /*
          | | | | | | |
          | | | | | | |
          | | | | | | |        
        */
        for(int linha =0 ; linha < grade.length ; linha++){
          for(int coluna = 0; coluna < grade.length; coluna++){
              grade[linha][coluna] = "L" + linha + "c"+coluna;
          }  
        }
        listarGrade(grade);
    }
    
    public static void listarVetor(String[] pvetor){
        for(String nome : pvetor){
            System.out.println(nome);
        }
    }
    
    public static void listarGrade(String[][] pGrade){
       for(int linha =0 ; linha < pGrade.length ; linha++){
           System.out.println(""); 
          for(int coluna = 0; coluna < pGrade.length; coluna++){
              System.out.print(pGrade[linha][coluna] + " ");
          }  
        } 
    }
    
}
