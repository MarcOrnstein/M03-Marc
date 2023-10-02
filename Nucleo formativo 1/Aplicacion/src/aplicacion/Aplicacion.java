/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacion;

import java.util.Scanner;

/**
 *
 * @author mahe2501
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m03,m04,m05;
        Scanner pantalla = new Scanner(System.in);
        // informar valor por el usuario
        System.out.println("que nota sacaras en m03");
        m03 = pantalla.nextInt();
        System.out.println("que nota sacaras en m04");
        m04 = pantalla.nextInt();
        System.out.println("que nota sacaras en m05");
        m05 = pantalla.nextInt();
        //m03 = 7;
        //m04 = 6;
        //m05 = 8;
        
        System.out.println("Nota m03 es un ... " + m03);
        System.out.println("Nota m04 es un ... " + m04);
        System.out.println("Nota m05 es un ... " + m05);
    }
    
}
