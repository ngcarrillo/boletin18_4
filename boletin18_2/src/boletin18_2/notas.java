/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18_2;

import javax.swing.JOptionPane;

/**
 *
 * @author ngarciacarrillo
 */
public class notas {

    int[] notas = new int[30];
    String[] nombres = {"pedro", "ana", "beatriz", "cristina", "juan", "jose", "aron", "luis", "pablo", "ismael", "david", "sandra", "paula", "paulo", "iago", "santiago", "gonzalo", "isable", "iria", "marcos", "alejandro", "alex", "lupe", "pepe", "maria", "luisa", "carmen", "cristian", "alfonso", "nuria"};

    public void cargarArray() {
        for (int x = 0; x < notas.length; x++) {
            notas[x] = (int) (Math.random() * 10) + 1;
        }
    }

    public void visualizarArray() {
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
            System.out.println(notas[i]);

        }
    }

    public void visualizar() {
        int aprobados = 0;
        int suspensos = 0;
        int notaAlta = 0;

        for (int x = 0; x < notas.length; x++) {
            if (notas[x] >= 5) {
                aprobados = aprobados + 1;
            }
            if (notas[x] < 5) {
                suspensos = suspensos + 1;
            }
            if (notas[x] > notaAlta) {
                notaAlta = notas[x];
            }
        }
        System.out.println("O numero de aprobados e " + aprobados);
        System.out.println("O numero de suspensos e " + suspensos);
        System.out.println("A nota máis alta é " + notaAlta);

    }

    public void calcularmedia() {
        float a = 0;
        for (int x = 0; x < notas.length; x++) {
            a = a + notas[x];
        }
        System.out.println("A nota media é" + a / notas.length);
    }

    public void buscarAlumno() {
        boolean alumnoEsta = false;
        String nombre = JOptionPane.showInputDialog("¿Cuál es el alumno que deseas buscar?");
        for (int x = 0; x < nombres.length; x++) {
            if (nombre.equalsIgnoreCase(nombres[x])) {
                JOptionPane.showMessageDialog(null, nombre + " " + notas[x]);
                alumnoEsta = true;
            }

        }

        if (alumnoEsta = false) {
            JOptionPane.showMessageDialog(null, "el alumno no esta");
        }

    }

    public void ordenar() {
        int aux;
        String aux1;
        for (int x = 0; x < notas.length - 1; x++) {
            for (int j = x + 1; j < notas.length; j++) {
                if (notas[j] > notas[x]) {
                    
                    
                    aux = notas[x];
                    notas[x] = notas[j];
                    notas[j] = aux;
                    
                    
                    aux1=nombres[x];
                    nombres[x]=nombres[j];
                    nombres[j]=aux1;

                }

            }
        }
        System.out.println("A continuación la lista de alumnos ordenados por nota");
         for (int w=0;w<nombres.length;w++){
             System.out.println(nombres[w]);
             System.out.println(notas[w]);
    }
}
}
