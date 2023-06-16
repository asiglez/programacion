/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5hoja2.ejercicio1;

/**
 *
 * @author Asier
 */
public class Encargado extends Empleado {

    public Encargado(double newSueldo) {
        super(newSueldo);
    }

    @Override
    public double getSueldo() {
        return super.sueldo * 1.1;
    }

}
