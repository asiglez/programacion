/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema2hoja3.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Ejercicio1 {

    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        Finanzas finanzas = new Finanzas();
        Finanzas finanzas2 = new Finanzas(1.10);
        System.out.println("Introduce cuantos dolares tienes");
        double dolares=teclado.nextDouble();
        System.out.println("La conversion de dolares a euros de finanzas son "+ finanzas.dolaresToEuros(dolares)+" euros");
        System.out.println("La conversion de dolares a euros de finanzas2 son "+ finanzas2.dolaresToEuros(dolares)+" euros");
        System.out.println("Introduce cuantos euros tienes");
        double euros=teclado.nextDouble();
        System.out.println("La conversion de euros a dolares de finanzas son "+ finanzas.eurosToDolares(euros)+" dolares");
        System.out.println("La conversion de euros a dolares de finanzas2 son "+ finanzas2.eurosToDolares(euros)+" dolares");
    }
}
