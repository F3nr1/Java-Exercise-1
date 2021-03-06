
package com.carlosfrias.reto1;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Exercise6 {
    
     //1. Scanner instance
    Scanner scannerInstance = new Scanner(System.in);

    //2. Variables 
    // password empty string var
    private String wifiPassword = "";
    // int numeric answer var
    private int serieAnswer;
    // attempts counters
    private int numberAttempts = 1;
    
    private int seriesAttempts = 1;
   
 
    
    //3. General method for string password  and   int number validation
    
    public void validateWifiSeries() {
        
        //Inicial screen wifi password
        
        System.out.println("        INGRESA TU CONTRASEÑA DEL WIFI");
        System.out.println("            Password:");
        
        //scanner instance for string capture
        
        wifiPassword = scannerInstance.nextLine();
        
       //4. loops for wifipassword and series validation 
        while (numberAttempts < 3) {
            
            // if((wifiPassword.equals("ABC123")){} check if password is equal from input
            // if(!(wifiPassword.equals("ABC123")){} check if password is different from input 
            
            if (!(wifiPassword.equals("ABC123"))) {
                System.out.println("Contraseña incorrecta intento número " + numberAttempts);
                System.out.println("            Password:");
                wifiPassword = scannerInstance.nextLine();
             // if wifiPassword is correct beging the next validation 
                
            }else if (wifiPassword.equals("ABC123")){
                
                //Inicial number screen 
                System.out.println("Contraseña correcta, conectado a tu red WIFI.");
                System.out.println("        INGRESA EL VALOR CORRECTO DE LA SIGUIENTE SERIE");
                System.out.println("            | 2 | 9 | 16 | 23 | 30 | 37 | 44 |:");
                //Capture Int value for a series of numbers
                serieAnswer = scannerInstance.nextInt();
                // while seriesattempts haven't reached 3 tries continue asking for the answer for the  num series 
                //While loop with independend seriesAttempts counter 
                while (seriesAttempts < 3) {
                    // if(serieAnswer != 51) check if user input is different from 51
               
                    if (serieAnswer != 51) {
                        System.out.println("Numero de la serie incorrecto, intente de nuevo." + seriesAttempts);
                        System.out.println("            | 2 | 9 | 16 | 23 | 30 | 37 | 44 |:");
                        serieAnswer = scannerInstance.nextInt();
                        
                        
                    //else if (serieAnswer == 51) user enter  to the system
                    }else if (serieAnswer == 51){
                        System.out.println("Bienvenido al sistema.\n");
                        
                        //Break  loop

                        break;

                    }
                    
                    //iincrease seriesAttempt by 1 on error 
                    seriesAttempts += 1;


                } 
                
                // if seriesAteempts = 3 print msg and reset counter
                if (seriesAttempts == 3){

                    System.out.println("Ha excedido  el numero maximo de intentos de la serie.");
                    seriesAttempts = 1;

                }
                  //finish program when it had reached 3 tries 
                        break;

                
            
 
               
            }
            // incrementa numeros de intentos series
            numberAttempts += 1;
            
            
        }
        
        //if numberAttempts == 3 print msg and reset counter  
        if (numberAttempts == 3){
            
            System.out.println("Ha excedido  el numero maximo de intentos de contraseña.");
            numberAttempts = 1;
            
        }
        
        
    }
    
   

    
        
}
