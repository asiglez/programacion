/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema1hoja3.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Base imponible:");
        double base=teclado.nextDouble();
        System.out.println("IVA (en porcentaje):");
        double iva=teclado.nextDouble();
        double importeIva=base*iva/100;
        double total=base-importeIva;
        System.out.println("Importe del IVA: "+ importeIva);
        System.out.println("Importe total: "+ total);
    }
}
