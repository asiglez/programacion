/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema3hoja6.ejercicio1;

/**
 *
 * @author Asier
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Tarjeta t=new Tarjeta("Asier",344766747,1000);
        t.setPin(4567);
        t.desbloquea(4567);
        t.pagar(100, 4567, "Leche Asturiana", "si");
    }
}
