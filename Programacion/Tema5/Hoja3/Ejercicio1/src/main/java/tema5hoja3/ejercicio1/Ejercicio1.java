/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema5hoja3.ejercicio1;

/**
 *
 * @author Asier
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Cono c1 = new Cono(5, 15);
        Cilindro c2 = new Cilindro(5, 15);
        System.out.println(c1.area());
        System.out.println(c1.volumen());
        System.out.println(c2.area());
        System.out.println(c2.volumen());
    }
}
