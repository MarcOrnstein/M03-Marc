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
           case 'e':
               System.out.println("enero");
       
               break;
               default:
                   System.out.println("mes no valido");
                   break;
                   
                   
           case 'f':
               System.out.println("febrero");
       
               break;
               
                  case 'm':
               System.out.println("marzo");
       
               break;
                  case 'a':
               System.out.println("abril");
       
               break;
               
 
       
                 

               
               
               
               
               
               
               
               
               
       }
       
       
       
       
       
       
    }
}
