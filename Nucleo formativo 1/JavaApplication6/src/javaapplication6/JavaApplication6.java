/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;
import java.util.Scanner;

public class JavaApplication6 {

    public static void main(String[] args) {
       int num1;
       int num2;
       int num3;
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Ingrese el valor 1:");
       num1 = scanner.nextInt();
       System.out.println("Ingrese el valor 2:");
       num2 = scanner.nextInt();
       System.out.println("Ingrese el valor 3:");
       num3 = scanner.nextInt();
       
       if (num1 == num2 && num2 == num3) {
           System.out.println("Los tres números son iguales.");
       }
       else {
           if (num1 != num2 && num1 != num3) {
               if (num1 > num2 && num1 > num3) {
                   System.out.println("El número 1 es el mayor.");
               }
           }
           if (num2 != num1 && num2 != num3) {
               if (num2 > num1 && num2 > num3) {
                   System.out.println("El número 2 es el mayor.");
               }
           }
           if (num3 != num1 && num3 != num2) {
               if (num3 > num1 && num3 > num2) {
                   System.out.println("El número 3 es el mayor.");
               }
           }
       }
       
    }
}