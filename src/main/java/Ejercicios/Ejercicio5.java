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
public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        // « DECLARAMOS VARIABLES »
        
        Scanner lecturaDatos = new Scanner(System.in);
        int numero = 0;
        int i;
        
        ////////////////////////////
        
        System.out.println("\n ***** TABLAS DE MULTIPLICAR *****");
        System.out.println("Ingrese un número 'n' del cual desee obtener su tabla de multiplicar (n*1, n*2,... n*10):");
        
        numero = lecturaDatos.nextInt(); // Leemos el número.
        
        System.out.println("TABLA DE MULTIPLICAR PARA EL NÚMERO '" + numero + "':");
        
        for (i = 1; i<11; i++){         // Vamos imprimiendo la tabla mediante un for aprovechando el valor de su subíndice.
            
            System.out.println("\t " + numero + " * " + i + " = " + (numero*i));
            
        }

    }
    
}
