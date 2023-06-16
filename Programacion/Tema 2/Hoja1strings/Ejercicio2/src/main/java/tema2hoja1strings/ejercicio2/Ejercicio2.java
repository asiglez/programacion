/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema2hoja1strings.ejercicio2;

/**
 *
 * @author Asier
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        String nombre = "Pepito";
        String primerApellido = "Perez";
        String segundoApellido = "Fernandez";
        nombre = nombre.concat(" "+primerApellido);
        nombre = nombre.concat(" "+segundoApellido);
        System.out.println(nombre);
        System.out.println("Longitud de la cadena nombre:  "+nombre.length());
    }
}
