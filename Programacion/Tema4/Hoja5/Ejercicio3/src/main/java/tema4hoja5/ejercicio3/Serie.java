/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4hoja5.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Serie {

    Scanner s = new Scanner(System.in);
    double a[];
    char variable;

    public Serie(int b, char c) {
        this.a = new double[b];
        this.variable = c;
        for (int i = 0; i < a.length; i++) {
            int d = i + 1;
            System.out.println("Introduce el " + d + " numero");
            a[i] = s.nextDouble();
        }
    }

    public double resultado() {
        double resultado = 0;
        if (variable == '+') {
            double suma = 0;
            for (int i = 0; i < a.length; i++) {
                suma += a[i];
            }
            resultado = suma;
        }
        if (variable == '*') {
            double multiplicacion = 1;
            for (int i = 0; i < a.length; i++) {
                multiplicacion *= a[i];
            }
            resultado = multiplicacion;
        }
        return resultado;
    }
}
