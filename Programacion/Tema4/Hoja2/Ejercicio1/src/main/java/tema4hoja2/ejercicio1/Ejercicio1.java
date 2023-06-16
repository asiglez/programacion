/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema4hoja2.ejercicio1;

/**
 *
 * @author Asier
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Operaciones a=new Operaciones(1,2,3,4,5);
        a.multiplicar();
        a.mostrar();
        System.out.println("La suma es: "+a.pares());
    }
}
