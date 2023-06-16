/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema4hoja1.ejercicio5;

/**
 *
 * @author Asier
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = a.length - 1, c = 0; i >= a.length / 2; i--, c++) {
            int d = 0;
            int f = 0;
            d = a[c];
            f = a[i];
            a[i] = d;
            a[c] = f;
        }
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.print(a[i] + ",");
        }
    }
}
