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
public class Ejercicio_11 {
    
    public static void main(String[] args) {
        
        // « DECLARAMOS VARIABLES »
        
        int enteroBinario = 0, digitoDeAnalisis = 0, sumaDecimal = 0, potencia = 0;
        boolean esBinario = false;
        String cadena_enteroBin = "";
        int i;
        Scanner lecturaDatos = new Scanner(System.in);
        
        ////////////////////////////
        
        System.out.println("***** CONVERSOR DE BINARIO A DECIMAL *****");
        System.out.println("» Ingrese el número binario que desea convertir: ");
        enteroBinario = lecturaDatos.nextInt();             // Hago una primer lectura.
        cadena_enteroBin = Integer.toString(enteroBinario); // Lo convierto a cadena para analizarlo dígito a dígito.
        
        // VALIDACIÓN DEL BINARIO INGRESADO
        
        while (esBinario == false){                         // Arranco asumiendo que NO es binario.
        
            for (i= 0; i< cadena_enteroBin.length(); i++){  // Empiezo a recorrer caracter por caracter.
            
                digitoDeAnalisis = Character.getNumericValue(cadena_enteroBin.charAt(i)); // Casteo el 'char' a numero.
                
                if ((digitoDeAnalisis != 1) && (digitoDeAnalisis != 0)){    // Si el dígito es distinto de 1 y 0...
                
                    System.out.println("\t || Error. El número no es binario. Intente nuevamente. ||\n");
                    i = (cadena_enteroBin.length() + 1) ;   // Corto el FOR haciéndolo pasarse del rango del índice.
                
                }
            
            }
            
            if (i == (cadena_enteroBin.length())){          // Si no corte el FOR, 'i' será igual al largo de la cadena.
            // Por ende, si no corte el 'FOR' forzosamente, el número no tuvo problemas de análisis - ergo - ES BINARIO.
                esBinario = true;
            }
            else
            {   
                // Caso contrario. Como el número NO era binario, preparamos una nueva entrada e iteración del while.
                System.out.println("» Ingrese el número binario que desea convertir");
                enteroBinario = lecturaDatos.nextInt();
                cadena_enteroBin = Integer.toString(enteroBinario);
            }
            
        }
       
        // YA CON EL BINARIO VALIDADO, LO PASAMOS A DECIMAL.
        
        for (i= (cadena_enteroBin.length()-1); i>= 0; i--){ // Recorremos el "número" (cadena) de derecha a izquierda.
            
            digitoDeAnalisis = Character.getNumericValue(cadena_enteroBin.charAt(i));   // Casteamos char a número.
            
            if (digitoDeAnalisis == 1){               // Preguntamos si ese dígito está "activo".
                sumaDecimal+= Math.pow(2, potencia);  // Si está activo, sumamos la potencia de 2 correspondiente.
            }
            
            potencia++; // Arrancó de 0 y se va incrementado para abarcar las sucesivas potencias de 2.
        }
        
        // IMPRIMIMOS LOS RESULTADOS
        
        System.out.println("» Equivalencia decimal: " + sumaDecimal);
 
    }
    
}
