/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema4hoja6.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Agenda a = new Agenda(4);
        Scanner s = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 6) {
            System.out.println("1. ingresar cliente");
            System.out.println("2. mostrar");
            System.out.println("3. buscar");
            System.out.println("4. eliminar");
            System.out.println("5 .salir");

            System.out.println("Introduce la opcion que quieras");
            opcion = s.nextInt();
            switch (opcion) {
                case 1 -> {
                    a.insertar();
                }
                case 2 -> {
                    a.mostrar();
                }
                case 3 -> {
                    System.out.println("Introduce el nombre de la persona a buscar");
                    System.out.println(a.buscar(s.next()));
                }
                case 4 -> {
                    System.out.println("Hay "+a.contador+" contactos");
                }
                case 5 -> {
                    System.out.println("Introduce el nombre de la persona: ");
                    a.modificar(s.next());
                }
                case 6 -> {
                    System.out.println("Saliendo del programa");
                }
                default -> {
                    System.out.println("Opcion erronea");
                }
            }
        }
    }
}
