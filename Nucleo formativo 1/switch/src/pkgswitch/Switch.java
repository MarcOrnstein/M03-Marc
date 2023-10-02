/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgswitch;
import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
       char dia;
       
       Scanner scanner = new Scanner(System.in);
       System.out.println("pon una letra entre e,f,m,a");
       dia = scanner.next().charAt(0);
       
       switch (dia) {
           case 'e' -> System.out.println("enero");
               default -> System.out.println("mes no valido");
                   
                   
           case 'f' -> System.out.println("febrero");
               
                  case 'm' -> System.out.println("marzo");
                  case 'a' -> System.out.println("abril");
               
                  case 'd' -> System.out.println("diciembre");
       
                 

               
               
               
               
               
               
               
               
               
       }
       
       
       
       
       
       
    }
}
