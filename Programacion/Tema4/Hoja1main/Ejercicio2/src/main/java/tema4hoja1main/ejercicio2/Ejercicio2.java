/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema4hoja1main.ejercicio2;

/**
 *
 * @author Asier
 */
public class Ejercicio2 {

    public static void main(String[] args) {
       Persona a = new Persona(args[0],Integer.valueOf(args[1]));
        
        a.esMayorEdad();
        a.imprimir();
    }
}
