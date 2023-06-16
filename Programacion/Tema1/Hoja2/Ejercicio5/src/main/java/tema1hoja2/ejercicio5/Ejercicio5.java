/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema1hoja2.ejercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author Asier
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        String texto=JOptionPane.showInputDialog("Escriba un precio");
        double precio=Double.parseDouble(texto);
        final double IVA=0.21;
        double descuento=0.10;
        double precioIVA= precio+(precio*IVA);
        double precioDescuento= precioIVA-(precioIVA*descuento);
        System.out.println("El precio sin IVA es: "+ precio);
        System.out.println("El precio con IVA es: "+ precioIVA);
        System.out.println("El precio después de aplicar un porcentaje de 10 de descuento es: "+ precioDescuento);
    }
}
