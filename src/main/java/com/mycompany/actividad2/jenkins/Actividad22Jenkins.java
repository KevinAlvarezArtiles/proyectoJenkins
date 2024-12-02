/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad2.jenkins;

/**
 *
 * @author Portatil_Kevin
 */
public class Actividad22Jenkins {

    public static void main(String[] args) {
        // Ejemplo de uso de la función dia_laboral
        System.out.println(dia_laboral("Lunes"));    // true
        System.out.println(dia_laboral("Sabado"));   // false
        System.out.println(dia_laboral("Domingo"));  // false
        System.out.println(dia_laboral("Viernes"));  // true
        System.out.println(dia_laboral("OtroDia"));  // false
    }

    // Método dia_laboral integrado en esta clase
    public static boolean dia_laboral(String dia) {
        return switch (dia) {
            case "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" -> true;
            case "Sabado", "Domingo" -> false;
            default -> false;
        };
    }
}
