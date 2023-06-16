/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5hoja5.ejercicio4;

/**
 *
 * @author Asier
 */
public class Flauta extends Instrumento {

    public Flauta() {
        super();
    }

    @Override
    public void tocarNota(String nota) {
        System.out.printf("Flauta: tocar nota %s.\n", nota);
    }
}
