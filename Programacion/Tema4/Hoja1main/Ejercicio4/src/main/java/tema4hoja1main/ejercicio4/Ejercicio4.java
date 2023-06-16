/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema4hoja1main.ejercicio4;

/**
 *
 * @author Asier
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Operaciones a = new Operaciones(Integer.valueOf(args[0]),Integer.valueOf(args[1]));
        a.suma();
        a.resta();
        a.multiplicacion();
        a.division();
    }
}
