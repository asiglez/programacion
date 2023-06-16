/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5hoja3.ejercicio1;

/**
 *
 * @author Asier
 */
public class Cilindro extends Figura {

    public Cilindro(double radio, double altura) {
        super(radio, altura);
    }

    @Override
    public double area() {
        double result = 2 * Math.PI * radio * (altura * radio);
        return result;
    }

    @Override
    public double volumen() {
        double result = Math.PI * Math.pow(radio, 2) * altura;
        return result;
    }

}
