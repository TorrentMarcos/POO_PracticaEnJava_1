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
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        // « DECLARAMOS VARIABLES »
        
        int año = 0; 
        Scanner lecturaDatos = new Scanner(System.in);
        
        ////////////////////////////
         
        System.out.println("\n****** ¿AÑO BISIESTO O NO? ******");
        System.out.println("Ingrese el año que desea consultar: ");
        año = lecturaDatos.nextInt();
        
        /* ¿Cuando un año será BISIESTO entonces? Cuando éste sea 
        múltiplo de 400; o cuando éste sea múltiplo de 4 y no de
        100 (paralelamente) */
        
        if ((año % 4 == 0) && (año % 100 != 0)) {
            System.out.println("El año " + año + " es BISIESTO.");
        }
        else if (año % 400 == 0){
            System.out.println("El año " + año + " es BISIESTO.");
        }
        else {
            System.out.println("El año NO es bisiesto. ");     
        }
        
        /* "También se podría haber creado un objeto "GregorianCalendar"
        con el año introducido por el usuario y, en base a eso, hacer
        uso del método isLeapYear() para determinar si es bisiesto o no */

    }
   
}
