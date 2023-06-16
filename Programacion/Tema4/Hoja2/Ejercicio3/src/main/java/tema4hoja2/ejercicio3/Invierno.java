/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4hoja2.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Invierno {

    Scanner s = new Scanner(System.in);
    private double temperaturas[];

    public Invierno(int n) {
        this.temperaturas = new double[n];
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Introduce una temperatura");
            temperaturas[i] = s.nextInt();
        }
    }

    public double tempMedia() {
        int n = 0;
        int contador = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            n += temperaturas[i];
            contador++;
        }
        double media = n / contador;
        return media;
    }

    public double[] fahrenheit() {
        double f[] = new double[temperaturas.length];
        for (int i = 0; i < temperaturas.length; i++) {
            f[i] = (temperaturas[i] * 1.8 + 32);
        }
        return f;
    }

    public String mostrar(double[] array) {
        String cadena = "";
        for (int i = 0; i < array.length; i++) {
            cadena = cadena.concat(String.valueOf(array[i]) + ",");
        }
        return cadena;
    }
}
