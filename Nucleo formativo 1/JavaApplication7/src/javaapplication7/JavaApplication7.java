/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;
import java.util.Scanner;

public class JavaApplication7 {

    public static void main(String[] args) {
       double nota;
       
       Scanner scanner = new Scanner(System.in);
       System.out.println("Que nota tienes");
       nota = scanner.nextDouble();
  
        if (nota >= 5 &&  nota <= 6) {
           System.out.println("bien");
       } 
        else if (nota >= 0 &&  nota <= 3)
                {
                System.out.println("muy deficiente");    
        }
        else if (nota >= 6 &&  nota <= 9)
                {
                System.out.println("notable");    
        }  
        
        else if (nota >= 9 &&  nota <= 10)
                {
                System.out.println("sobresaliente");    
        }  
                
                
                
                
                          
                
                
                
    }
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
