/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema5hoja9.ejercicio2;

/**
 *
 * @author Asier
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Prueba a = new Prueba();
        a = null;
        try {
            System.out.println(a.getCadena());
        } catch (NullPointerException npe) {
            System.out.println("El objeto es Null");
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
