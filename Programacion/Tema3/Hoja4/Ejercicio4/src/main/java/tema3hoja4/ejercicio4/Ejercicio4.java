/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema3hoja4.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce la contraseña(4 digitos)");
        int acceso = s.nextInt();
        int contraseña = (int) Math.floor(Math.random() * 9999) + 1;
        if (acceso == contraseña) {
            System.out.println("La caja fuerte se ha abierto satosfactoriamente");
        } else {
            for (int i = 3; i > 0; i--) {
                System.out.println("Lo siento, esa no es la combinación le quedan " + i + " intentos");
                System.out.println("Introduce la contraseña");
                acceso = s.nextInt();
                if (acceso == contraseña) {
                    System.out.println("La caja fuerte se ha abierto satosfactoriamente");
                    i = 0;
                }
            }
        }
    }
}
