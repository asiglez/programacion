/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5hoja3.ejercicio1;

/**
 *
 * @author Asier
 */
public class Cono extends Figura{

    public Cono(double radio, double altura) {
        super(radio, altura);
    }

    @Override
    public double area() {
        double g=Math.sqrt(Math.pow(altura,2)+Math.pow(radio,2));
        double area=Math.PI*radio*(radio+g);
        return area;
        }

    @Override
    public double volumen() {
        double volumen = Math.PI*Math.pow(radio,2)*altura;
        return volumen;
        }
    
}
