/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema4hoja1.ejercicio6;

/**
 *
 * @author Asier
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int f = 0;
        for (int i = 0; i <= a.length-1; i++) {
            if (a[i] > f) {
                a[i] = f;
            }
        }
        System.out.println(f);
    }
}
