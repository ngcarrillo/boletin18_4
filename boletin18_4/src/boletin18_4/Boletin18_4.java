/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18_4;

import javax.swing.JOptionPane;

/**
 *
 * @author Nuria
 */
public class Boletin18_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] letra= {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
   
        int Dni = Integer.parseInt (JOptionPane.showInputDialog("introduce tu numero de DNI"));
    
        int i = Dni%23;
        JOptionPane.showMessageDialog (null, "la letra de tu dni es " + letra[i]+ " "+Dni+letra[i]);
    }
    
}
