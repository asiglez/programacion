/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2hoja7.ejercicio2;

/**
 *
 * @author Asier
 */
public class Triangulo {

    public int lado1;
    public int lado2;
    public int lado3;

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public boolean esIsosceles() {
        boolean resultado;
        if (lado1==lado2 && lado1!=lado3 || lado1==lado3 && lado1!=lado2 || lado2==lado3 && lado1!=lado2) {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }
    public boolean esEquilatero() {
        boolean resultado;
        if (lado1==lado2 && lado1==lado3) {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }
    public double perimetro(){
        double perimetro=lado1+lado2+lado3;
        return perimetro;
    }
}
