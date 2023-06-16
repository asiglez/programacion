/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema2hoja4.ejercicio2;

/**
 *
 * @author Asier
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Coche c1 = new Coche("1234RET",20);
        c1.mostrar();
        Coche c2 = new Coche("1234RET");
        c2.mostrar();
        c2.frena(10);
        c2.mostrar();
        c1.acelera(80);
        c1.mostrar();
        c1.letras();
    }
}
