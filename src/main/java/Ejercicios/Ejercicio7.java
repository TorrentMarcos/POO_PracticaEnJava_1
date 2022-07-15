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
public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        // « DECLARAMOS VARIABLES »
        
         final int numeroGanador = 38;
         int numero = 0;
         int cantIntentos = 1; // Esto lo quise agregar sólo para darle un poco más de "juego" (no es relevante). 
         Scanner lecturaDatos = new Scanner(System.in);
         
        ////////////////////////////
        
        System.out.println("******* ¡ADIVINÁ EL NÚMERO! « 0 - 100 » (Extremos incluídos) *******");
        System.out.println("\t « Nota: El juego te irá dando pistas sucesivas hasta que logres adivinar »");
        
         /* A efectos prácticos, voy a limitar el número ganador en un rango de 0 - 100. De lo
         contrario, el pobre usuario podría volverse loco intentando adivinar en un rango gigante. */
         
        System.out.println("\n Adivina, adivinador... ¿En qué número estoy pensando?: ");
        numero = lecturaDatos.nextInt(); // Si de casualidad adivina, ya evitamos todo el while.
        
        while (numero != numeroGanador){ // Mientras no se acierte el número ganador...
            
            cantIntentos++; // Sumamos un próximo intento.
            
            System.out.println("\n¡Ups! (°~°) Parece que todavía no has acertado...");
            
            if (numero > numeroGanador){ 
                System.out.println("\t « Pista: El número que estás buscando es MENOR »");
            }
            else{
                System.out.println("\t « Pista: El valor que estás buscando es MAYOR » ");
            }
            
            System.out.println("\n¡Nuevo intento! ¿En qué número estoy pensando?");
            numero = lecturaDatos.nextInt(); // Si adivina, no vuelve al while. De lo contrario, sigue.
             
        }
        
        System.out.println ("\n*** ¡Felicidades! ¡Ganaste! (°͜°). El número era: " + numeroGanador + " ***");
        System.out.println("\t « Juego resuelto en el intento N°: " + cantIntentos + " »");
        
    }
    
}
