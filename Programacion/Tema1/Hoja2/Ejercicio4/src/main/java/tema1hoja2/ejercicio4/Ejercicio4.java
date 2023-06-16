/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema1hoja2.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Altura:");
        double altura=teclado.nextDouble();
        System.out.println("Base:");
        double base=teclado.nextDouble();
        double area=(base*altura)/2;
        System.out.println("El área del triángulo es:"+area);
    }
}
