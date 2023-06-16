/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4hoja2.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Alumno {

    Scanner s = new Scanner(System.in);
    private String alumno;
    private int a[] = new int[5];

    public Alumno(String alumno) {
        this.alumno = alumno;
        for (int i = 0; i < a.length; i++) {
            int nota = i + 1;
            System.out.println("Introduce la " + nota + " nota");
            a[i] = s.nextInt();
        }
    }

    public int mayor() {
        int mayor = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > mayor) {
                mayor = a[i];
            }
        }
        return mayor;
    }

    public int menor() {
        int menor = 1000000;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < menor) {
                menor = a[i];
            }
        }
        return menor;
    }

    public String mostrar() {
        int n = 0;
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            n += a[i];
            contador++;
        }
        double media = n / contador;
        String cadena = alumno.toUpperCase() + ": " + media;
        return cadena;
    }
}
