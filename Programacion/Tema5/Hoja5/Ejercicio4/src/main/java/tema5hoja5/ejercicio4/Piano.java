/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5hoja5.ejercicio4;

/**
 *
 * @author Asier
 */
public class Piano extends Instrumento {

    public Piano() {
        super();
    }

    @Override
    public void tocarNota(String nota) {
        System.out.printf("Piano: tocar nota %s.\n", nota);
    }
}
