/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema2hoja5.ejercicio1;

/**
 *
 * @author Asier
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Restaurante r = new Restaurante(7, 8);
        System.out.println("Quedan "+r.getHuevos()+" huevos");
        System.out.println("Quedan "+r.getChorizo()+" kilos de chorizo");
        r.addHuevos(2);
        r.addChorizos(3);
        System.out.println("Quedan "+r.getHuevos()+" huevos");
        System.out.println("Quedan "+r.getChorizo()+" kilos de chorizo");
        r.getNumPlatos();
        r.sirvePlato();
        System.out.println("Quedan "+r.getHuevos()+" huevos");
        System.out.println("Quedan "+r.getChorizo()+" kilos de chorizo");
    }
}
