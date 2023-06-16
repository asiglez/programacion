/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema2hoja1strings.ejercicio3;

/**
 *
 * @author Asier
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        String frase="El nano va a ser campeon del mundo en 2023";
        frase=frase.replace("a","o");
        frase=frase.replace("e","o");
        frase=frase.replace("i","o");
        frase=frase.replace("u","o");
        System.out.println(frase);
    }
}
