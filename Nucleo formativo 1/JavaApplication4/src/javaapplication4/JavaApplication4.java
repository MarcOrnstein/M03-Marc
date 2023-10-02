/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;
import java.util.Scanner;
/**
 *
 * @author mahe2501
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int edad;
       Scanner scanner = new Scanner( System.in);
       
       System.out.println("introduce edad");
       edad = scanner.nextInt();
               
       if (edad>=18) 
       {
           System.out.println("eres mayor de edad");
       }
       else {
           System.out.println("eres menor de edad");
       }
    }
    
}
