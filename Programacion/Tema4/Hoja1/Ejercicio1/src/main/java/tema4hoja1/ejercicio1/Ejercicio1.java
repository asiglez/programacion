/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema4hoja1.ejercicio1;

/**
 *
 * @author Asier
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int [] a = {-2,-2,-2,-2,-2,-2,-2,-2,-2,-2};
        for (int i = 0; i < a.length; i++) {
            a[i] = -1;
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) Math.random();
        }
    }
}
