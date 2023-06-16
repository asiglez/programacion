/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema3hoja4.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Metodo m = new Metodo();
        System.out.println("• Método 1. Nos pide un número N por teclado y nos muestra todos sus divisores.\n"
                + "• Método 2. Pide por teclado dos números enteros N1 y N2 y nos visualiza todos los números impares que hay entre ellos, indicando al final cual es la suma de todos ellos.\n"
                + "• Método 3. Pide un número N entero y positivo por teclado, nos visualiza su correspondiente tabla de multiplicar \n"
                + "• Método 4. Dados dos números A y B introducidos por teclado, calcular y visualizar el cociente y el resto de dividir A entre B, realizar la división mediante restas sucesivas.");
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
                    m.metodo4();
                case 0:
                    System.out.println("Saliendo del menu");
                default:
                    System.out.println("No has introducido un opcion valida");
            }
        } while (opcion != 0);
    }
}
