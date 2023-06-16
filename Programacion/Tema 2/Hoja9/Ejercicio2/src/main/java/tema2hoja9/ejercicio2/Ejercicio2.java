/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema2hoja9.ejercicio2;

/**
 *
 * @author Asier
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Alimento a=new Alimento("Filete de pollo",100,300,true);
        System.out.println(a.getNombre());
        System.out.println(a.getGrasas());
        System.out.println(a.getHidratos());
        System.out.println(a.isOrigenAnimal());
        System.out.println(a.toString());
        System.out.println(a.esDietetico());
        System.out.println(a.calorias(100));
    }
}
