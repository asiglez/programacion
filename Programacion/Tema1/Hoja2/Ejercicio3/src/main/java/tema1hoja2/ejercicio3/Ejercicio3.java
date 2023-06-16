/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema1hoja2.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Precio de la vivienda");
        double precio=teclado.nextDouble();
        double peseta=166.386;
        System.out.println("El precio de la vivienda en euros es:" + precio);
        System.out.println("El precio de la vivienda en pesetas es:" + (int)(precio*peseta));
    }
}
