/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema4hoja2.ejercicio3;

/**
 *
 * @author Asier
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Invierno i=new Invierno(4);
        System.out.println("Temperatura media: "+i.tempMedia());
        System.out.println(i.fahrenheit());
        System.out.println(i.mostrar(i.fahrenheit()));
    }
}
