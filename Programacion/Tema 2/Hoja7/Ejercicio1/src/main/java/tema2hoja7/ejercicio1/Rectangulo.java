/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2hoja7.ejercicio1;

/**
 *
 * @author Asier
 */
public class Rectangulo {

    private int largo;
    private int ancho;

    public Rectangulo() {
    }

    public Rectangulo(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public double area() {
        double area = largo * ancho;
        return area;
    }

    public double diagonal() {
        double diagonal = Math.sqrt(Math.pow(largo, 2) + Math.pow(ancho, 2));
        return diagonal;
    }
}
