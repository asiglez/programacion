/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5hoja2.ejercicio3;

/**
 *
 * @author Asier
 */
public abstract class Forma {

    protected String identificador;

    public void identidad() {
        System.out.println("Soy un " + identificador);
    }

    @Override
    public abstract String toString();
}
