
package com.carlosfrias.reto1;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Exercise7 {
    
    //1. Scanner Instance
    Scanner scannerInstance = new Scanner(System.in);
    
    //2. Empty vars
    //Name  string var
    private String name;
    // Character char var
    private char findCharacter;
    // Counter of chars found set int = 0
    private int totalCharacters = 0;
    // temp storage of char 
    private char temp;
     
    

    //2. Char finder method
    public void characterFinder(){
        //Print  msg
        System.out.println("BUSCADOR DE CARACTERES EN NOMBRE. ");
        // Print the user should write a name
        System.out.println("    Ingrese su nombre: ");
        //Scanner instance for user string capture
        name = scannerInstance.nextLine();
        //msg for character to find
        System.out.println("    Ingrese el caracter a buscar: ");
        // Scanner instance for character to look for 
        findCharacter = scannerInstance.next().charAt(0);
        
        //3. For loop to counter how many times character which have been put by the used is inside a string
        for (int i = 0; i < name.length(); i++) {

            temp = name.charAt(i);
            if (temp == findCharacter)
                totalCharacters++;
                
        
            
        
        
            }
        
        //4. print output of the search
        
        System.out.println("    Nombre: "+name);
        System.out.println("    Caracter buscado: "+findCharacter);
        System.out.println("    Cantidad de ocurrencias: "+totalCharacters); 
        System.out.println("\n");
                
        
        
        
    }
        
        
    
    
    
    
    
}
