/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema1hoja1.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Íntroduce el primer número: ");
        int x = teclado.nextInt();
        System.out.println("Íntroduce el segundo número: ");
        int y = teclado.nextInt();
        System.out.println("x = " + (double)x + " y = " + (double)y);
        System.out.println("x + y = " + ((double)x + (double)y));
        System.out.println("x - y = " + ((double)x - (double)y));
        System.out.println("x * y = " + (double)x * (double)y);
        System.out.println("x / y = " + (double)x / (double)y);
        System.out.println("x ^ 2 = " + Math.pow((double)x,2));
        System.out.println("√ x = " + Math.sqrt((double)x));
    }
}
