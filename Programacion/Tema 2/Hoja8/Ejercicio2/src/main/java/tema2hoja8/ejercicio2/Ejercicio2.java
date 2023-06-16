/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema2hoja8.ejercicio2;

/**
 *
 * @author Asier
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Libro l= new Libro("9788499640884","El nano","Asier");
        System.out.println(l.getIsbn());
        System.out.println(l.getTitulo());
        System.out.println(l.getAutor());
        System.out.println(l.esEspanol());
        l.mostrar();
    }
}
