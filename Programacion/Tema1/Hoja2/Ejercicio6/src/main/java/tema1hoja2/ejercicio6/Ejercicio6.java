/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema1hoja2.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Ejercicio6 {

    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        System.out.println("Radio:");
        double radio=teclado.nextDouble();
        System.out.println("Altura:");
        double altura=teclado.nextDouble();
        System.out.println("a. Su area lateral es igual a: "+2*Math.PI*radio*altura);  
        System.out.println("b. Su volumen es igual a: "+Math.PI*Math.pow(radio,2)*altura);
    }
}
