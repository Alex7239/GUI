/*
 Nombre: Valenzuela Romero Manuel Alejandro
 Matricula:2022742
 */
package Gui;

import java.awt.Color;
import javax.swing.JFrame;


public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setTitle("Cesba");
        
        frame.setResizable(true);
        //Formato Default
        //frame.getContentPane().setBackground(Color.pink);
        //Formato RGB
        //frame.getContentPane().setBackground(new Color (255, 87, 51));
        //Formato HEXA
        frame.getContentPane().setBackground(new Color(0x33FFB5));
    }
    
}
