/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema4hoja4.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int matriz1[][] = {{101, 102, 103, 104, 105},
        {201, 202, 203, 204, 205},
        {301, 302, 303, 304, 305},
        {401, 402, 403, 404, 405},
        {501, 502, 503, 504, 505}};
        int o = 0;
        do {
            System.out.println("Que opcion quieres elegir?");
            System.out.print("1.-muestra elementos de una fila.\n"
                    + "2.-  muestra los elementos de una columna.\n"
                    + "3.- Mostrar los elementos de la diagonal\n"
                    + "4.- Mostrar los elementos de la diagonal inversa\n"
                    + "5.- Mostrar los elementos de la diagonal hacia arriba\n"
                    + "6.- Salir\n");
            o = s.nextInt();
            switch (o) {
                case 1: {
                    System.out.println("¿Que fila quieres elegir?");
                    int fila = s.nextInt() - 1;
                    if (matriz1.length > fila) {
                        for (int i = 0; i < matriz1[fila].length; i++) {
                            System.out.print(matriz1[fila][i] + ",");
                        }
                        System.out.println("");
                    } else {
                        System.out.println("Numero de Fila erroneo");
                    }
                }
                case 2: {
                    System.out.println("¿Que columna quieres elegir?");
                    int columna = s.nextInt() - 1;
                    if (matriz1[0].length > columna) {
                        for (int i = 0; i < matriz1.length; i++) {
                            System.out.print(matriz1[i][columna] + ",");
                        }
                        System.out.println("");
                    } else {
                        System.out.println("Numero de Columna erroneo");
                    }
                }
                case 3: {
                    for (int i = 0; i < matriz1.length; i++) {
                        System.out.println(matriz1[i][i] + ",");
                    }
                }

                case 4: {
                    for (int i = 0; i < matriz1.length; ++i) {
                        System.out.println(matriz1[i][matriz1.length - 1 - i]);
                    }
                }
                case 5: {
                    for (int i = matriz1.length - 1; i >= 0; i--) {
                        System.out.println(matriz1[i][i] + ",");
                    }
                }
                case 6: {
                    System.out.println("Saliendo del programa");
                }

            }

        } while (o != 6);
    }
}
