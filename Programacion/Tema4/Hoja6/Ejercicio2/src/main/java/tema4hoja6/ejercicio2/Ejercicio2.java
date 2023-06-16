/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema4hoja6.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Ejercicio2 {

    public static void main(String[] args) {
         Banco b = new Banco(4);
        Scanner s = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("1. ingresar cliente");
            System.out.println("2. mostrar");
            System.out.println("3. buscar");
            System.out.println("4. eliminar");
            System.out.println("5 .salir");

            System.out.println("Introduce la opcion que quieras");
            opcion = s.nextInt();
            switch (opcion) {
                case 1 -> {
                    b.ingresar();
                }
                case 2 -> {
                    b.mostrar();
                }
                case 3 -> {
                    System.out.println(b.buscar());
                }
                case 4 -> {
                    System.out.println("Introduce el codigo del usuario a eliminar");
                    b.eliminar(s.nextInt());
                }
                case 5 -> {
                    System.out.println("Saliendo del programa");
                }
                default -> {
                    System.out.println("Opcion erronea");
                }
            }
        }
    }
}
