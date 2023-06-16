/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema3hoja4.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un donativo: ");
        int d = s.nextInt();
        int a=d;
        int contadord = 1;
        int i;
        for (i = a; i <= 600; i += d) {
            System.out.println("Introduce un donativo: ");
            d = s.nextInt();
            contadord++;
        }
        System.out.println("Donacion completada. \n"
                + "Se han necesitado: " + contadord + "\n"
                + "El total de la donacion ha sido: " + i);
    }
}
