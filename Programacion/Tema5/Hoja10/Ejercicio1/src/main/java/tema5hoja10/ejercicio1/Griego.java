/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5hoja10.ejercicio1;

/**
 *
 * @author Asier
 */
public class Griego extends Guerrero {

    public Griego(String newnombre, int newedad, int newfuerza) {
        super(newnombre, newedad, newfuerza);
    }

    public Griego() {
        super();
    }

    @Override
    public boolean retirarse() {
        boolean result = false;
        if (super.getHerido() && !super.getMuerto()) {
            result = true;
        }
        return result;
    }
}
