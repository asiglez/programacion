/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema2hoja4.ejercicio3;

/**
 *
 * @author Asier
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Monedero m = new Monedero(20);
        m.ingresar(10.4);
        m.mostrar();
        m.sacar(50);
        m.mostrar();
        m.sacar(20);
        m.mostrar();
    }
}
