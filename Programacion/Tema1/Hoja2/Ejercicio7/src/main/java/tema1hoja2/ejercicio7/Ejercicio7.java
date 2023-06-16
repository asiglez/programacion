/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema1hoja2.ejercicio7;

/**
 *
 * @author Asier
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        int a=23;
        int b=56;
        System.out.println("Valor de a antes del cambio: "+a);
        System.out.println("Valor de b antes del cambio: "+b);
        int aux=b;
        b=a;
        a=aux;
        System.out.println("Valor de a despues del cambio: "+a);
        System.out.println("Valor de b despues del cambio: "+b);
    }
}
