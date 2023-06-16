/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema2hoja7.ejercicio1;

/**
 *
 * @author Asier
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        Rectangulo r2 = new Rectangulo(10, 5);
        r1.setLargo(8);
        r1.setAncho(4);
        System.out.println(r1.getAncho());
        System.out.println(r2.getAncho());
        System.out.println(r1.getLargo());
        System.out.println(r2.getLargo());
        System.out.println(r1.area());
        System.out.println(r2.area());
        System.out.println(r1.diagonal());
        System.out.println(r2.diagonal());
    }
}
