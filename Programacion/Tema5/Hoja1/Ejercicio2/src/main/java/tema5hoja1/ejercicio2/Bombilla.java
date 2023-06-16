/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5hoja1.ejercicio2;

/**
 *
 * @author Asier
 */
public class Bombilla {

    private static Estado iGeneral;
    private Estado iBombilla;
    private boolean luce;

    public Bombilla() {
        this.iBombilla = Estado.OFF;
    }

    public Bombilla(Estado iBombilla) {
        this.iBombilla = iBombilla;
    }

    public void cambiarInterruptor(Estado estado) {
        iBombilla = estado;
    }

    public static void cambiarGeneral(Estado estado) {
        iGeneral = estado;
    }

    public void luce() {
        if (iBombilla == Estado.ON && iGeneral == Estado.ON) {
            luce = true;
        } else {
            luce = false;
        }

        System.out.println("La bombilla luce? :" + luce);
    }
}
