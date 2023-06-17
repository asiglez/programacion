/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6hoja2.ejercicio2;

import java.util.Comparator;

/**
 *
 * @author Asier
 */
public class PersonaPorNombre implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getNombre().compareToIgnoreCase(o2.getNombre());
    }
}
