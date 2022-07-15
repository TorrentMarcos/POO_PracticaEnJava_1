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
public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        // « DECLARAMOS VARIABLES »
        
        Scanner lecturaDatos = new Scanner(System.in);
        int numero = 0, cantidadDivisores = 0;
        int i;
        
        ////////////////////////////
        
        System.out.println("\n***** CALCULADORA DE DIVISORES *****");
        System.out.println("Ingrese el número ENTERO POSITIVO del cual quiera saber sus divisores: ");
        numero = lecturaDatos.nextInt();
        
        int divisores[]= new int[numero];  /* Creamos un array de un tamaño equivalente al número
        introducido, dado que esto nos permitirá usar "inteligentemente" la memoria RAM. El número 20,
        por ejemplo, no puede tener más de 20 divisores. El número 8, no puede tener más de 8 y así...
        Lógicamente - en la mayoría de las casos - nunca se abarcarán todos los subíndices, pero -
        aún así - nos estamos asegurando de no quedarnos cortos con los espacios asignados a nuestro
        vector almacenador de divisores. Trabajarlo con listas sería mucho más eficiente dado que
        todos los espacios del "vector" tendrían un divisor dentro y no se desperidiciaría memoria. */
        
        if (numero > 0){ // Validamos que el número sea positivo.
            
            for (i= 1; i<= numero; i++){ // Empezamos a buscar divisores.
                if ((numero % i) == 0) {
                    divisores[cantidadDivisores] = i;
                    cantidadDivisores++; // Lo preparo para la próxima.
                }
            } 
            
            //Mostramos los divisores encontrados para nuestro número
            System.out.println("Divisores del número " + numero + " :");
            for (i = 0; i< cantidadDivisores; i++){
                System.out.println(divisores[i]);
            }
            
        }
        else{ 
            System.out.println(" « El valor ingresado no es válido » ");
        }

    }
    
}
