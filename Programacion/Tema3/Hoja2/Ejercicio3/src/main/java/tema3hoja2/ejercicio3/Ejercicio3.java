/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema3hoja2.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = s.nextInt();
        System.out.println("Elige una opcion \n"
                + "Opción 1: calcular el cuadrado del número leído. \n"
                + "Opción 2: calcular el doble del número. \n"
                + "Opción 3: calcular la raíz cuadrada del número.");
        int opcion = s.nextInt();
        switch (opcion) {
            case 1:
                double resultado1 = Math.pow(numero, 2);
                System.out.println(resultado1);
                break;
            case 2:
                double resultado2 = numero * 2;
                System.out.println(resultado2);
                break;
            case 3:
                double resultado3 = Math.sqrt(numero);
                System.out.println(resultado3);
                break;
            default:
                System.out.println("No has elegido ninguna opcion valida");
        }
    }
}
