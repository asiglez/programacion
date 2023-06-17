/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6hoja7.ejercicio1;

/**
 *
 * @author Asier
 */
public abstract class CuentaCorriente extends CuentaBancaria implements Identificable {

    private boolean autoriza;

    public CuentaCorriente(Persona titular, String ccc) {
        super(titular, ccc);
        this.autoriza = true;
    }

    public boolean getAutoriza() {
        return autoriza;
    }

    public void setAutoriza(boolean autoriza) {
        this.autoriza = autoriza;
    }
}
