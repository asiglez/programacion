/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema3hoja3.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Calculo c = new Calculo();
        System.out.println(" •Método1: método que presenta por pantalla una cuenta atrás empezando por 10\n"
                + "• Método2: método que pide 10 números enteros y muestra cuantos de ellos son negativos, cuantos positivos y cuantos nulos.\n"
                + "• Método3: método que pide por teclado un número y nos calcula el factorial\n"
                + "• Método4: método que nos pide una serie de caracteres por teclado. La serie finaliza al teclear el carácter ‘.’. Al final nos dirá cuántos caracteres hemos tecleado.\n"
                + "• Método5: método que nos calcula la media de un conjunto de números positivos introducidos por teclado. A priori, no se sabe cuántos números se introducirán. El usuario termina de introducir los datos cuando el número es negativo\n"
                + "• Método 0 : salir del menu");
        int opcion = s.nextInt();
        do {
            switch (opcion) {
                case 1:
                    c.metodo1();
                    break;
                case 2:
                    c.metodo2();
                    break;
                case 3:
                    c.metodo3();
                    break;
                case 4:
                    c.metodo4();
                    break;
                case 5:
                    c.metodo5();
                    break;
                case 0:
                    System.out.println("Saliendo del menu");
                    break;
                default:
                    System.out.println("No has introducido un opcion valida");
            }
        } while (opcion != 0);
    }
}