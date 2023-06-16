/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema3hoja5.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = 0;
        int min = 0;
        int seg = 0;
        System.out.println("Introduce la hora: ");
        if (s.nextInt() < 24 && s.nextInt() > 0) {
            h = s.nextInt();
        } else {
            System.out.println("Hora mal introducida");
        }
        System.out.println("Introduce el minuto: ");
        if (s.nextInt() < 60 && s.nextInt() > 0) {
            min = s.nextInt();
        } else {
            System.out.println("Minuto mal introducida");
        }
        System.out.println("Introduce el segundo: ");
        if (s.nextInt() < 60 && s.nextInt() > 0) {
            seg = s.nextInt();
        } else {
            System.out.println("Segundo mal introducida");
        }
        for (int i = h; i <= 23; i++) {
            for (int a = min; a <= 59; a++) {
                for (int b = seg; b <= 59; b++) {
                    System.out.println(i + ":" + a + ":" + b);
                }
                seg = 0;
            }
            min = 0;
        }
    }
}
