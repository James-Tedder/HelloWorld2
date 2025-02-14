/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package githelloworld;

import java.util.*;

/**
 *
 * @author jlt10
 */
public class GitHelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println("Current date is " + d1);
        
        System.out.println("Here ye : important announcement");
        System.out.println("Hello World");
        System.out.println("Goodbye");
        System.out.println("Hi Alice!");
        System.out.println("Hi Bob!");
        System.out.println("Hi Charlie!");
        System.out.println("Hi Denise!");
        System.out.println("Hi Ester!");
        
        Runtime gfg = Runtime.getRuntime();
        System.out.println("Initial free memory: " + gfg.freeMemory() + " bytes");
    }
    
}
