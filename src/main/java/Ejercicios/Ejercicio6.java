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
public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        // « DECLARAMOS VARIABLES »
        
        Scanner lecturaDatos = new Scanner(System.in);
        int numero1 = -1, numero2 = -1, suma = 0;
        int i;
        
        ////////////////////////////
        
        System.out.println("*** PROGRAMA PARA CALCULAR LA SUMA DE TODOS LOS MÚLTIPLOS DE 5 COMPRENDIDOS ENTRE 2 ENTEROS POSITIVOS***");
        System.out.println("\t « Nota: Tenga en cuenta que los extremos del intervalo son excluídos »");
        
        // VALIDACIÓN DEL EXTREMO INICIAL DEL INTERVALO.
        while (numero1 <0){
        
            System.out.println("\n (1) Ingrese el número entero que servirá como PUNTO DE PARTIDA / INICIO del intervalo:");
            numero1 = (lecturaDatos.nextInt());
            
            /* Nota: El enunciado menciona "2 enteros positivos introducidos por teclado" pero, dado que los extremos
            no serán tenidos en cuenta; si el usuario - por ejemplo - introduce '0' (inicio) y '10' (fin) los números
            analizados serán: 1,2,3,4,5,6,7,8 y 9. Si excluímos al '0' como dato de entrada, estando los extremos
            excluídos (o así, al menos, se interpretó la palabra "ENTRE"); el '1' será un número que JAMÁS se
            analizará sin importar el caso. */
                 
            if (numero1 < 0){
                System.out.println("\t -- « Error. El número introducido debe ser mayor o igual a 0. Ingresé el valor nuevamente »");
            }
        
        }
        
        // VALIDACIÓN DEL EXTREMO FINAL DEL INTERVALO.
        while ((numero2 < 0) || (numero2 == (numero1+1)) || (numero2 < numero1)){ // Estas "reglas" se explican más adelante.
        
            System.out.println("\n (2) Ingrese el número entero que servirá como PUNTO DE LLEGADA / FINAL del intervalo:");
            numero2 = lecturaDatos.nextInt();
            
            if ((numero2 < 0) || (numero2 == (numero1+1)) || (numero2 < numero1)){
                
                /* La primer "regla" evita números negativos y, en el caso del while, también da entrada inicial al bucle.
                
                /* La segunda "regla" evita intervalos tipo '0-1' (de una unidad de diferencia entre los extremos).
                Dado que no estamos tomando los extremos, siquiera serían "intervalos" en este caso. */
                
                /* La tercera "regla" fuerza a que siempre el extremo final sea mayor que el extremo inicial.
                Podrían unificarse la 2da y 3ra regla en un '(numero2 <= numero1+1)' pero, a efectos de
                comprensión, prefiero dejarlo así */
                
                System.out.print("\t -- « Error. El valor final del intervalo deber ser mayor en al menos 2 unidades"
                        + "respecto del valor inicial. De lo contrario, el 'intervarlo' no tendría valores intermedios »");
                System.out.println("\n"); // Pongo este '\n' separadito porque sino me tira una "advertencia".
            }
            
        }
        
        // YA TENIENDO LOS DOS NÚMEROS APROBADOS, EMPEZAMOS A RESOLVER.
        
        System.out.println("\n ** Buscando y sumando todos los múltiplos de 5 comprendidos entre '" + numero1 + "' y '" + numero2 + "' **\n");
        
        for (i=(numero1+1); i<numero2; i++){ // Arrancamos de 'numero1+1' y terminamos en '< numero2' porque no tomamos extremos.
            
            if (i%5 == 0){ // ¿El número actual es múltiplo de 5?
                System.out.println("\t ¡Se encontró un múltiplo de 5! -> " + i);
                suma+= i; // Lo sumamos al total.
            }            
        }
        
        // IMPRIMIMOS LOS RESULTADOS
        
        System.out.println("\n*******************************\n");
        
        if (suma == 0){ // No se encontraron múltiplos en el intervalo.
            System.out.println("» No se encontraron múltiplos de 5 entre los valores " + numero1 + " y " + numero2);
        }
        else {          // Se encontraron múltiplos en el intervalo.
            System.out.println("» Sumatoria total de los múltiplos de 5 comprendidos entre " + numero1 + " y " + numero2 + " : " + suma); 
        }

    }
    
}
