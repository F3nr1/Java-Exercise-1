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
public class Exercise6 {
    
     //1. Creamos la instancia de la librería Scanner
    Scanner scannerInstance = new Scanner(System.in);

    //2. Variables necesarias para esta clase
    
    private String wifiPassword = "";
    
    private int serieAnswer;
    
    private int numberAttempts = 1;
    
    private int seriesAttempts = 1;
   
 
    
    //3. Creamos el método que valida la clave del wifi y los intentos
    public void validateWifiSeries() {
        System.out.println("        INGRESA TU CONTRASEÑA DEL WIFI");
        System.out.println("            Password:");
        wifiPassword = scannerInstance.nextLine();
       //4. loops for wifipassword and series validation 
        while (numberAttempts < 3) {
            // if((wifiPassword.equals("ABC123")){} se valida si son iguales
            // if(!(wifiPassword.equals("ABC123")){} se valida si son diferentes
            if (!(wifiPassword.equals("ABC123"))) {
                System.out.println("Contraseña incorrecta intento número " + numberAttempts);
                System.out.println("            Password:");
                wifiPassword = scannerInstance.nextLine();
             // if wifiPassword is correct beging the next validation 
            }else if (wifiPassword.equals("ABC123")){
                System.out.println("Contraseña correcta, conectado a tu red WIFI.");
                System.out.println("        INGRESA EL VALOR CORRECTO DE LA SIGUIENTE SERIE");
                System.out.println("            | 2 | 9 | 16 | 23 | 30 | 37 | 44 |:");
                serieAnswer = scannerInstance.nextInt();
                // while seriesattempts haven't reached 3 tries continue asking for the answer for the  num series 
                while (seriesAttempts < 3) {
                    // if(serieAnswer != 51) check if user input is different from 51
                    
                    if (serieAnswer != 51) {
                        System.out.println("Numero de la serie incorrecto, intente de nuevo." + seriesAttempts);
                        System.out.println("            | 2 | 9 | 16 | 23 | 30 | 37 | 44 |:");
                        serieAnswer = scannerInstance.nextInt();
                        
                        
                    //else if (serieAnswer == 51) enter to the system
                    }else if (serieAnswer == 51){
                        System.out.println("Bienvenido al sistema.\n");

                        break;

                    }else{

                    }
                    
                    //iincrease seriesAttempt by 1 on error 
                    seriesAttempts += 1;


                } // if seriesAteempts = 3 print msg and reset counter
                if (seriesAttempts == 3){

                    System.out.println("Ha excedido  el numero maximo de intentos de la serie.");
                    seriesAttempts = 1;

                }
                  //finish program when it had reached 3 tries 
                        break;

                
            
 
               
            }else{
                
            }// incrementa numeros de intentos series
            numberAttempts += 1;
            
            
        }
        //if numberAttempts == 3 print msg and reset counter  
        if (numberAttempts == 3){
            
            System.out.println("Ha excedido  el numero maximo de intentos de contraseña.");
            numberAttempts = 1;
            
        }
        
        
    }
    
   

    
        
}
