/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author Marcos
 */
import java.util.Scanner;

public class Ejercicio1 {
    
      public static void main(String[] args) {
          
      // « DECLARO VARIABLES »
        
      int i, j, suma = 0, producto = 0, cantDiferentes = 0, restoDivision = 0;
      int max = -99999999, min = 99999999;
      int indiceMayor = 0, indiceMenor = 0, indiceRestante = 0;
      int numeros[] = new int[3];
      float promedio = 0, divisionNormal = 0;
      Scanner lectorNumero = new Scanner(System.in);
      
      // « COMIENZO CON LOS CÁLCULOS »
      
      //For para ingresar los 3 números por teclado.
      
      for (i = 0; i < 3; i++){  

        System.out.println("Ingrese número " + (i + 1) + ": ");
        numeros[i] = lectorNumero.nextInt();
        suma += numeros[i]; // Aprovecho y, de paso, ya los voy SUMANDO.
        
        // Aprovecho y también voy separando el MAYOR.
        if (numeros[i] > max){
            max = numeros[i];
            indiceMayor = i;
        }
        
        // Igual que el caso anterior, pero con el MENOR.
        if (numeros[i] < min){
            min = numeros[i];
            indiceMenor = i;
        }
        
        /* ¿Por qué dos "If's" separados? Porque podría suceder que
        un número cumple la condición de ser el mínimo y el máximo a la vez */
        
      }
     
      promedio = (((float)suma)/3); // Hacemos el PROMEDIO.
      
      // Calculo el PRODUCTO del número mayor * número menor.
      producto = (numeros[indiceMayor] * numeros[indiceMenor]);
      
      /*Bueno. Ahora tengo que saber si el número restante es divisible por 3.
      El tema primero es... ¿Cómo sé cuál fue el número restante? ¡A buscar!
      */
      
      for (i = 0; i < 3; i++){
          if ((i != indiceMayor) && (i != indiceMenor)){
              indiceRestante = i; // ¡Acá encontré su sub-índice!
          }
      }
      
      restoDivision = (numeros[indiceRestante] % 3); /* Veremos qué pasó con
      esto en la parte de las impresiones por consola */
      divisionNormal = ((float) numeros[indiceRestante]) / 3; /* Este dato
      lo quiero sólo para detallar un poco más la información que después voy
      a mostrar en consola. Podría omitirlo. */
      
     /* For que recorre el array numeros[] con dos sub-índices haciendo
      comparaciones a fin de determinar CUÁNTOS NÚMEROS "NO-IGUALES" existen */
      
     for (i = 0; i < 3; i++){
         for (j = i+1 ; j <= 2; j++){    
             if (numeros[i] != numeros[j]){
                 cantDiferentes++;
             }  
         }
     }
     
     // RESULTADOS FINALES
     System.out.println("\n************* RESULTADOS *************\n");
     System.out.println("1) Cantidad de n°'s diferentes (no-repetidos): " + cantDiferentes);
     System.out.println("2) Promedio: " + promedio);
     System.out.println("3) Suma total: " + suma);
     System.out.println("4) Producto entre el mayor (" + numeros[indiceMayor] + ") y el menor (" + numeros[indiceMenor] +"): " + producto);
     System.out.println("5) ¿El número restante (" + numeros[indiceRestante] + ") es divisible por 3?");
     
     if (restoDivision == 0){
         System.out.println("\t - Sí. El número es divisible por 3 (se obtiene un resultado entero). -> " + ((int) divisionNormal));
     } 
     else {
         System.out.println("\t - No. El número no es divisible por 3 (se obtiene un resultado con coma). -> " + divisionNormal);
     }

    }
      
}
