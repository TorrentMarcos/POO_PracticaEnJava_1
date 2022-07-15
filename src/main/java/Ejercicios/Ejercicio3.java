/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        // « DECLARAMOS VARIABLES »
        
        int numero = 0, productoFactorial = 1;
        int i;
        Scanner lecturaDatos = new Scanner(System.in);
        
        ////////////////////////////
        
        System.out.println("\n ******** CALCULADORA DE FACTORIALES ********");
        System.out.println("Ingrese un número ENTERO MAYOR o IGUAL a 0: ");
        numero = lecturaDatos.nextInt();
        
        if (numero >= 0){ // Hacemos "validación" para separar los números negativos.
            
            if (numero == 0) productoFactorial = 1; // 0! = 1
            
            /*Podría obviar el "productoFactorial = 1" del If dado que ya lo inicialicé
            en 1 antes, pero... a efectos de comprensión, optaré por dejarlo así*/
            
            else { // Resto de factoriales.

                // « Ejemplo de factorial -> 4! = 4 × 3 × 2 × 1 = 24 »
                
                for (i = 1; i <= numero; i++){
                    productoFactorial *= i;
                }
            }
            System.out.println("El factorial de " + numero + " (" + numero + "!) es: " + productoFactorial); 
        }
        else {
            System.out.println("« El valor ingresado no es válido »");
        }
     
    }
    
}
