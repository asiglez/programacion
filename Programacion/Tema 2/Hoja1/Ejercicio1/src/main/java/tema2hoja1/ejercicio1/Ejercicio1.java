/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema2hoja1.ejercicio1;

/**
 *
 * @author Asier
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        CajaAhorro ca = new CajaAhorro();
        ca.depositar(500);
        System.out.println("Tenemos: "+ca.obtenerSaldo()+" de saldo");
        ca.girar(300);
        System.out.println("Tenemos: "+ca.obtenerSaldo()+" de saldo");
        System.out.println("Hemos hecho: "+ca.obtenerTransacciones()+" transacciones");
        CajaAhorro ba = new CajaAhorro(200);
        System.out.println("Tenemos: "+ba.obtenerSaldo()+" de saldo");
        System.out.println("Hemos hecho: "+ba.obtenerTransacciones()+" transacciones");
    }
}
