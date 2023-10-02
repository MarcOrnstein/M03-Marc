/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;
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
       int num1 ;
       int num2 ;
       Scanner scanner = new Scanner( System.in);
       
       System.out.println("pon valor 1");
       num1 = scanner.nextInt();
         System.out.println("pon valor 2o");
       num2 = scanner.nextInt();       
       if (num1 == num2) 
       {
           System.out.println("ambos son iguales");
       }
       else if (num1 > num2) 
       {
           System.out.println("numero 1 es mas grande que 2");
            System.out.println(num1+ "superior a" + num2);
       }
       else {
           System.out.println(num2+ "superior a" + num1);
       }
    }
    
}
