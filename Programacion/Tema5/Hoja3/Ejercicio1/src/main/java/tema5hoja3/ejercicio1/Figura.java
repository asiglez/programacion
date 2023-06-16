/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5hoja3.ejercicio1;

/**
 *
 * @author Asier
 */
public abstract class Figura {
    public double radio;
    public double altura;

    public Figura(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public double getAltura() {
        return altura;
    }
    public abstract double area();
    public abstract double volumen();
}
