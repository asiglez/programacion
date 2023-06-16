/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema4hoja5.ejercicio3;

/**
 *
 * @author Asier
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Serie s1 = new Serie(4, '*');
        Serie s2 = new Serie(4, '+');
        System.out.println(s1.resultado());
        System.out.println(s2.resultado());
    }
}
