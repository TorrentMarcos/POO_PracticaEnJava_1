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
public class Ejercicio_10 {
    
    public static void main(String[] args) {
        
        // « DECLARAMOS VARIABLES »
        
        int horasTrabajadas = 0, horasExtra = 0;
        float tarifaHoras = 0, sueldo = 0;
        int i;
        Scanner lecturaDatos = new Scanner(System.in);
        
        ////////////////////////////
        
        System.out.println("***** CALCULADORA DE SUELDO BRUTO [5 EMPLEADOS] *****");
        
        for (i= 0; i< 5; i++){
            
            // - « ENTRADA » 
            
                // Horas.
            
            System.out.println("\n « Cómputo de sueldo para empleado N°: " + (i+1) + " »");
            System.out.println("\n a) Ingrese cantidad de horas trabajadas: ");
            horasTrabajadas = lecturaDatos.nextInt(); // Hacemos una primera lectura de HORAS.
            
            while (horasTrabajadas < 0){ // Si el ingreso fue erroneo, forzamos una entrada válida. 
                System.out.println("\t ¡Ups! Este valor no puede ser negativo. Intentelo nuevamente.");
                System.out.println("\n a) Ingrese cantidad de horas trabajadas: ");
                horasTrabajadas = lecturaDatos.nextInt();
            }
            
                // Tarifa.
            
            System.out.println("\n b) Ingrese tarifa por hora de trabajo: ");
            tarifaHoras = lecturaDatos.nextFloat(); // Hacemos una primera lectura de TARIFA.
            
            while (tarifaHoras < 0){ // Si el ingreso fue erroneo, forzamos una entrada válida.
                System.out.println("\t ¡Ups! Este valor no puede ser negativo. Intentelo nuevamente.");
                System.out.println("\n b) Ingrese tarifa por hora de trabajo: ");
                tarifaHoras = lecturaDatos.nextFloat();
            }
            
            // - « PROCESO »
            
            if (horasTrabajadas <= 40 ){ // PARA SUELDOS DE 40 HORAS O MENOS.
                sueldo = horasTrabajadas * tarifaHoras;
            }
            else {                      // PARA SUELDOS DE MÁS DE 40 HORAS.
                horasExtra = horasTrabajadas - 40;
                sueldo = (horasTrabajadas * tarifaHoras) + (horasExtra * (tarifaHoras/2));
            }
            
            // - « SALIDA »
            
            /* Dado que el problema no especifica la forma en qué se precisan almacenar los datos (o si esto es
            necesario siquiera), mostraré los resultados individuales en cada iteración del FOR. Nota: Podría
            también haber creado una matriz bidimensional para luego recorrerla y visualizar todos los empleados.
            El problema en el último caso es que desconozco si el "id" del empleado es el legajo, el DNI, etc. */

            System.out.println("\n\t » Sueldo bruto computado: " + sueldo);
            System.out.println("\n*************************");

        }
         
    }
    
}
