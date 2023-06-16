/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema4hoja1.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] temperatura = new int[10];
        int suma = 0;
        for (int i = 0; i <= temperatura.length - 1; i++) {
            System.out.println("Introduce una temperatura");
            int grados = s.nextInt();
            temperatura[i] = grados;
            suma += temperatura[i];
        }
        System.out.println("La temperatura media es: " + (double) (suma / temperatura.length));
    }
}
