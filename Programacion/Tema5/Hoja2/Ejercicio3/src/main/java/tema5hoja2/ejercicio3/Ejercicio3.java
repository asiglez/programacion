/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema5hoja2.ejercicio3;

/**
 *
 * @author Asier
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Circulo c1=new Circulo();
        Cuadrado c2=new Cuadrado();
        Triangulo t=new Triangulo();
        Rombo r=new Rombo();
         System.out.println(c1.toString());
         System.out.println(c2.toString());
         System.out.println(t.toString());
         System.out.println(r.toString());
         c1.identidad();
         c2.identidad();
         t.identidad();
         r.identidad();
    }
}
