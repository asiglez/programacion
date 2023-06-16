/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema1hoja2.ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Radio:");
        double radio=teclado.nextDouble();
        double longitud=(2*Math.PI*radio);
        double area=(Math.PI*Math.pow(radio,2));
        System.out.println("La longitud es: "+longitud);
        System.out.println("El area es: "+area);
    }
}
