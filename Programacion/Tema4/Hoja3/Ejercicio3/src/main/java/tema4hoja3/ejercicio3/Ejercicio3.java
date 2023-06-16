/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema4hoja3.ejercicio3;

/**
 *
 * @author Asier
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Comunidad c= new Comunidad("Cantabria",4);
        System.out.println(c.mostrar());
        System.out.println(c.sorteo());
        System.out.println(c.buscar("Santillana"));
    }
}
