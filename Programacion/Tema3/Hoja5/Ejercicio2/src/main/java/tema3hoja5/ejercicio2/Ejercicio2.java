/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema3hoja5.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el numero de filas: ");
        int nFilas = s.nextInt();
        int n1 = 9;
        int n2 = 1;
        for (int i = 1; i <= nFilas; i++) {
            if (i % 2 != 0) {
                for (int a = 9; a >= 1; a--) {
                    System.out.print(a+" ");
                }
                System.out.println();
            }else{
                for (int a = 1; a <= 9; a++) {
                    System.out.print(a+" ");
                }
                System.out.println();
            }
        }
    }
}
