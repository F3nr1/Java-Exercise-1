/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carlosfrias.reto1;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Exercise7 {
    
    //1. Creamos la instancia de la librería Scanner
    Scanner scannerInstance = new Scanner(System.in);
    //2. Intancias de cadena y caracter a buscar
    private String name;
    private char findCharacter;
    private int totalCharacters = 0;
    private char temp;
     
    

    
    public void characterFinder(){
        System.out.println("BUSCADOR DE CARACTERES EN NOMBRE. ");
        System.out.println("    Ingrese su nombre: ");
        name = scannerInstance.nextLine();
        System.out.println("    Ingrese el caracter a buscar: ");
        
        findCharacter = scannerInstance.next().charAt(0);
        
        
        for (int i = 0; i < name.length(); i++) {

            temp = name.charAt(i);
            if (temp == findCharacter)
                totalCharacters++;
                
        
            
        
        
            }
        System.out.println("    Nombre: "+name);
        System.out.println("    Caracter buscado: "+findCharacter);
        System.out.println("    Cantidad de ocurrencias: "+totalCharacters); 
        System.out.println("\n");
                
        
        
        
    }
        
        
    
    
    
    
    
}
