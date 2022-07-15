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
public class Ejercicio9 {
    
    public static void main(String[] args) {
        
        // « DECLARAMOS VARIABLES »
        
        int radio = 0, diametro = 0;
        double circunferencia = 0; // La defino como "double" porque voy a trabajar con Math.PI (double). 
        double area = 0;           // Double. También lo voy a trabajar con Math.PI.
        Scanner lecturaDatos = new Scanner(System.in);
        
        ////////////////////////////
        
        // - « ENTRADA »
        
        System.out.println("**** CALCULADORA DE ÁREA, DIÁMETRO y CIRCUNFERENCIA DE UN CÍRCULO ****");
        
        System.out.println("\t Ingrese el valor del radio (r): ");
        radio = lecturaDatos.nextInt(); // Hago una primer lectura del radio.
        
        while (radio < 0){ // Si de casualidad se ingresó mal (r < 0), 'loopeo' la entrada hasta que el 'r' sea válido.
            System.out.println("¡Ups! Este valor no puede ser negativo. Pruebe nuevamente");
            System.out.println("\t Ingrese el valor del radio (r): ");
            radio = lecturaDatos.nextInt(); 
        }
        
        // - « PROCESO »
        
        diametro = (2 * radio);
        circunferencia = (2 * Math.PI * radio);
        area = Math.PI * Math.pow(radio, 2);
        
        // - « SALIDA »
        
        System.out.println("\n******* RESULTADOS PARA RADIO (r)= " + radio + " (cm / mts / etc.) *******");
        System.out.println("\n\t - Diámetro (2*r) = " + diametro + " (cm / mts / etc.)");
        System.out.println("\t - Circunferencia (2 * PI * r) = " + circunferencia + " (cm / mts / etc.)");
        System.out.println("\t - Área (PI * r²) = " + area + " (cm² / mts² / etc.)");
        
    }
           
}
