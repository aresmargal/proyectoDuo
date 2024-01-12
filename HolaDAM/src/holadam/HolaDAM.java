/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holadam;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

/**
 *
 * @author sobblaas
 */
public class HolaDAM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Hola DAM");
        System.out.println("Hola DAM");
        System.out.println("Hola DAM");
        System.out.println("Hola DAM");
        System.out.println("Hola DAM");

        // TODO code application logic here
        System.out.println("Hola usuario");
        System.out.println("Son las: " + 
                DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).format(LocalTime.now()));
        System.out.println("Hace un buen dia");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero A: ");
        int a = sc.nextInt();        
        System.out.print("Numero B: ");
        int b = sc.nextInt();       
        System.out.println(a + " + " + b + " = " + hacerSuma(a,b));
    }
    
    public static int hacerSuma(int a, int b){
        return a+b;
    }
    
}
