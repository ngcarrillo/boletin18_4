/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18_2;

/**
 *
 * @author ngarciacarrillo
 */
public class notas {
    int [] notas = new int[30];

public void cargarArray(){
 for (int x=0;x<notas.length;x++){
      notas[x] = (int) (Math.random()*10)+1;
      System.out.println(notas[x]);
   }
}
 public void visualizar() {
    int aprobados=0;
    int suspensos=0;
    int notaAlta=0;
     
 for (int x=0; x<notas.length; x++){
     if(notas[x]>=5){
         aprobados = aprobados +1;
     } 
     if (notas[x]<5){
         suspensos = suspensos + 1;
     }
     if (notas[x]>notaAlta){
         notaAlta = notas[x];
     }
 } System.out.println ("O numero de aprobados e "+aprobados);
 System.out.println ("O numero de suspensos e "+suspensos);
  System.out.println ("A nota máis alta é "+notaAlta);
     
     
 }
 
 public void calcularmedia(){
float a = 0;
for (int x=0; x<notas.length; x++){
    a = a + notas[x];
} System.out.println ("A nota media é"+a/notas.length);

    
    
    
 }}
