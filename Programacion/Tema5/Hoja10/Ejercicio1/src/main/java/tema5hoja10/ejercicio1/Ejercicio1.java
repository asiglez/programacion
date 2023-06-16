/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema5hoja10.ejercicio1;

/**
 *
 * @author Asier
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("creo el troyano");
        Troyano t = new Troyano("troyanoprueba", 18, 20);

        System.out.println("creo el griego");
        Griego g = new Griego("griegoprueba", 32, 24);

        System.out.println("Creo un caballo vacio con capacidad para 3 hombres");
        Caballo caballo = new Caballo(t, 3);

        System.out.println("el numero de Griegos en el caballo son: " + caballo.montar(g));
        System.out.println("el numero de Griegos en el caballo son: " + caballo.montar(g));
        System.out.println("el numero de Griegos en el caballo son: " + caballo.montar(t));
        System.out.println("el numero de Griegos en el caballo son: " + caballo.montar(g));
        System.out.println("el numero de Griegos en el caballo son: " + caballo.montar(g));

        System.out.println("Creo un caballo vacio con capacidad para 3 hombres");
        Caballo caballo2 = new Caballo(t, 3);

        Troyano a = new Troyano();
    }
}
