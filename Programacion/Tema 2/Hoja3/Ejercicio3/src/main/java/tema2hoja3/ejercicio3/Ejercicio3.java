/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema2hoja3.ejercicio3;

/**
 *
 * @author Asier
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Satelite s = new Satelite(5000,4000,30000);
        System.out.println("Metodo printPosicion: " + s.printPosicion());
        s.variarAltura(-15000);
        System.out.println("Metodo variarAltura: " + s.printPosicion());
        s.variarPosicion(3000, 2000);
        System.out.println("Metodo variarPosicion: " + s.printPosicion());
        System.out.println("Esta en orbita el satelite: " + s.enOrbita());
    }
}
