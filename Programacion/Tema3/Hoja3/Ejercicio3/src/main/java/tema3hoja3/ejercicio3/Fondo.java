/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3hoja3.ejercicio3;

/**
 *
 * @author Asier
 */
public class Fondo {

    private double c;
    private double i;
    private int n;

    public Fondo(double c, double i, int n) {
        this.c = c;
        this.i = i;
        this.n = n;
    }

    public void evolucion() {
        double ca=1;
        while (ca <= n) {
            c=c+(c*i/100*n);
            ca++;
            System.out.println(c);
        }
        System.out.print(c);
    }
}
