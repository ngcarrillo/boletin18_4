/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18_1;

/**
 *
 * @author ngarciacarrillo
 */
public class Boletin18_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] numeros = new int [6];
        
        
   for (int x=0;x<numeros.length;x++){
      numeros[x] = (int) (Math.random()*50)+1;
      System.out.println(numeros[x]);
   }
   System.out.println("");
   for (int x=numeros.length-1; x>=0; x--){
       System.out.println(numeros[x]);
   
   }
    
 }
}
   
   
    
    
    

