/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5hoja1.ejercicio1;

/**
 *
 * @author Asier
 */
public class Pajaro {

    String color;
    int edad;
    static int numPajaros;

    public Pajaro() {
        nuevoPajaro();
    }

    public Pajaro(String color, int edad) {
        this.color = color;
        this.edad = edad;
        nuevoPajaro();
    }

    public static void nuevoPajaro() {
        numPajaros++;
    }

    public static void muestraPajaro() {
        System.out.println("Se han creado " + numPajaros + " pajaros.");
    }
}
