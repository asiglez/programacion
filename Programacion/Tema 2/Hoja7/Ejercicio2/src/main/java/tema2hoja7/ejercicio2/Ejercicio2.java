/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema2hoja7.ejercicio2;

/**
 *
 * @author Asier
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Triangulo t = new Triangulo(10, 40, 10);
        System.out.println(t.esIsosceles());
        System.out.println(t.esEquilatero());
        System.out.println(t.perimetro());
    }
}
