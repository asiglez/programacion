/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema2hoja3.ejercicio2;

/**
 *
 * @author Asier
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Numero n = new Numero(5);
        System.out.println("Metodo Get: " + n.getNum());
        n.suma(4);
        System.out.println("Metodo Suma: " + n.getNum());
        n.resta(4);
        System.out.println("Metodo Resta: " + n.getNum());
        n.doble();
        System.out.println("Metodo Doble: " + n.getNum());
        n.triple();
        System.out.println("Metodo Triple: " + n.getNum());
        n.setNum(10);
        System.out.println("Metodo Set: " + n.getNum());
    }
}
