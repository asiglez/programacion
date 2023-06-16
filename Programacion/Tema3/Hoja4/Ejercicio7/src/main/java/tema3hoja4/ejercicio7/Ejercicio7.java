/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema3hoja4.ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Metodo m = new Metodo(6);
        System.out.println("1.- Contar cuantas cifras tiene.\n"
                + "2.- Escribe sus 10 primeros múltiplos.\n"
                + "3.- Decir si es perfecto.\n"
                + "4.- Salir.");
        int opcion = s.nextInt();
        do {
            switch (opcion) {
                case 1:
                    m.metodo1();
                case 2:
                    m.metodo2();
                case 3:
                    m.metodo3();
                case 4:
                    System.out.println("Saliendo del menu");
                default:
                    System.out.println("No has introducido un opcion valida");
            }
        } while (opcion != 4);
    }
}
