
package com.carlosfrias.reto1;
    
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Main {
    
    public static void main(String[] args){
            Scanner scannerIntance = new Scanner(System.in);
        
        boolean exitMenu = false;
        int menuOption = 0;
        //1. Instance for execution 
        Exercise1 exercise1Instance = new Exercise1();
        Exercise2 exercise2Instance = new Exercise2();
        Exercise3 exercise3Instance = new Exercise3();
        Exercise4 exercise4Instance = new Exercise4();
        Exercise5 exercise5Instance = new Exercise5();
        Exercise6 exercise6Instance = new Exercise6();
        Exercise7 exercise7Instance = new Exercise7();
        
        // Loop for menu input    
        while(!exitMenu){
          System.out.println("SELECCIONE UNA OPCIÓN.");
          System.out.println("""
                             =================================================
                                1.Pedir Datos Usuario
                                2.Numeros Pares O Impares
                                3.Numeros Pares O Impares Negativos
                                4.Numero Impar Negativo
                                5.Validar Contraseña WIFI
                                6.Validar Contraseña 2
                                7.Buscador De Caracteres
                                8.Salir
                             =================================================
                             """);
              menuOption = scannerIntance.nextInt();
           //switch for menu execution  
           switch (menuOption) {
                case 1:
                    exercise1Instance.requestDataUser();
                    break;
                case 2:
                    exercise2Instance.numberOddEven();
                    break;
                case 3:
                    exercise3Instance.negativeNumberOddEven();
                    break;
                case 4:
                    exercise4Instance.negativeNumberOdd();
                    break;
                case 5:
                    exercise5Instance.validateWifiPassword();
                    break;
                case 6:
                    exercise6Instance.validateWifiSeries();
                    break;
                case 7:
                    exercise7Instance.characterFinder();
                    break;
                case 8:
                    //Stop the program by change the value of ExitMenu to true and print a exit msg 
                    exitMenu = true;
                    System.out.println("El programa ha finalizado.");
                    //Break and finish the  loop after exit the program
                    break;
               // Any other option input print a msg which only accept inputys from 1 to 8
                default:
                    System.out.println("Sólo se admiten opciones entre 1 y 8.\n");
            }
               
            
              
        }
            
        
       
      
            
            
        }
    
    
    
    
}
    
    
    
    

    
       
    

    
        
      
       
        
          
        
        
         
        
