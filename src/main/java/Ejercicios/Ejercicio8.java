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
public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        // « DECLARAMOS VARIABLES »
        
        int numero = 0, suma = 0;
        int i;
        int max = -99999999, min = 99999999;
        int indiceMax = 0, indiceMin = 0;
        Scanner lecturaDatos = new Scanner(System.in);
        
        ////////////////////////////
        
        System.out.println("***** SUMADOR 'POTENCIAL' DE 'n' NÚMEROS ('n' perteneciente a N) *****"); // N = Números Naturales.
        System.out.println("\t « De todos los num. ingresados se sumarán sólo aquellos comprendidos entre el valor mayor y menor »");
        
        while (numero <= 0){ // VALIDAMOS EL INGRESO DEL NUMERO INICIAL QUE REGULARÁ LA CANTIDAD DE ENTEROS A SUMAR.
            
            System.out.println("\n Ingrese la cantidad potencial de números a sumar: ");
            numero = lecturaDatos.nextInt();
            
            if (numero <= 0){
                System.out.println("\t « Error. El número introducido debe ser mayor a 0. Inténtelo otra vez »");
            }
        }
        
        // UNA VEZ APROBADO NUESTRO NÚMERO INICIAL, PROSEGUIMOS...
        
        int numerosSuma[] = new int[numero]; // Creamos el array después de tener el número inicial así no desperdiciamos memoria.
       
        // Cargamos los datos y, de paso, aprovechamos para ir identificando al máximo y al mínimo.
        
        System.out.println(" \n ** ¡Perfecto! Hora de ingresar tus " + numero + " numeros **\n");
        
        for (i= 0; i< numero; i++){
            
            System.out.println("\t Ingrese el valor N°" + (i + 1) + ":");
            numerosSuma[i] = lecturaDatos.nextInt();
            // Dado que el enunciado menciona que estos números son sólo enteros, no aplicamos restricción de signo.
            
            if (numerosSuma[i] > max){
                indiceMax = i;        // Guardamos el índice.
                max = numerosSuma[i]; // Guardamos el nuevo máximo.
            }
            
            if (numerosSuma[i] < min){
                indiceMin = i;         // Guardamos el índice.
                min = numerosSuma [i]; // Guardamos el nuevo mínimo.
            }
            
            /* ¿Por qué en "If's" separados? - Porque podría darse que un número podría ser ambos (máx y mín).
               » Otra aclaración: En caso de n°'s iguales, estamos tomando el índice del primer máx y mín encontrado.
               Supongamos, por ejemplo, que un array tiene los valores: 8-8-2-1. ¿De dónde empezaríamos a sumar
               entonces? Ambos '8' son valores máximos y tienen índices distintos. Para este ejercicio, en
               aclaración, estoy sumando - en caso de n°'s IGUALES - desde el primer máx (y mín) encontrado */

        }
        
        /* Ya teniendo los números cargados e identificados, me interesa saber qué índice (indiceMax, indiceMin)
        es mayor/menor (o incluso podrían ser iguales), dado que de esa manera voy a encarar el recorrido del FOR
        que hará la suma (de adelante para atrás, de atrás para adelante, etc.) */
        
        /* Sin embargo, también hay otro tema interesante... ¿Y si el número mayor está al lado del número menor?
        La suma debe realizarse sólo - o así se cree dado el enunciado - ENTRE los valores intermedios a éstos. 
        Por lo tanto, haré primero una validación para descartar estos posibles casos. */
        
        if ((indiceMax+1 != indiceMin) && (indiceMax-1 != indiceMin)){ // SI los índices (los números) no están contiguos.
        
            if (indiceMax < indiceMin){
            
                for (i= indiceMax+1; i<indiceMin; i++){
                    suma+= numerosSuma[i];
                }
            }
            else if (indiceMax > indiceMin){
                for (i= indiceMax-1; i>indiceMin; i--){
                    suma+= numerosSuma[i];
                }
            }
            else{
                suma = 0; // El máximo y el mín son el mismo número (misma posición). No hay intermedios.
            }
            
        }
        else // Indices contiguos (no hay números intermedios).
        {
            suma = 0; // A nivel práctico, esta línea es innecesaria (arriba ya 'suma' estaba incializada en 0).
        }
        
        // IMPRIMO LOS RESULTADOS
        
        System.out.println("\n *********** RESULTADOS ***********");
        
        if (suma !=0){
            
            System.out.println("\n » SUMA TOTAL ENTRE EL VALOR MÁX y MIN = " + suma);
            System.out.print("\t Nota: Recuerde que SÓLO se toman valores INTERMEDIOS y que, en caso de dos"
                    + " máximos/mínimos idénticos, se toma como referencia aquel que se identificó primero.");
            
        } else {
            System.out.println("\nSUMA TOTAL ENTRE EL VALOR MÁX y MIN = 0");
            System.out.println("\t Nota: Esto puede deberse a que: ");
            System.out.println("\t\t • El máximo y el mínimo sean el mismo número identificado (no hay intermedios)");
            System.out.println("\t\t • El máximo y el mínimo estén contiguos (no hay intermedios)");
            System.out.println("\t\t • Existan varios máximos / mínimos idénticos y al haberse tomado como referencia el primero, el resto de escenarios quedó fuera de análisis.");     
        }
        
        System.out.println("\n\n CADENA DE VALORES INGRESADA:");
        for (i=0; i<numero; i++){
            System.out.println("\t" + numerosSuma[i]);
        }

    }
    
}
