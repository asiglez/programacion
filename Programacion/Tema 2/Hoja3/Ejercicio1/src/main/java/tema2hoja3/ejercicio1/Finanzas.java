/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2hoja3.ejercicio1;

/**
 *
 * @author Asier
 */
public class Finanzas {
    public double cambio;

    public Finanzas() {
        cambio = 1.06;
    }

    public Finanzas(double cambio) {
        this.cambio = cambio;
    }

    public double dolaresToEuros(double dolares) {
        double result = dolares * cambio;
        return result;
    }

    public double eurosToDolares(double euros) {
        double result = euros / cambio;
        return result;
    }
}
