/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4hoja3.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Curso {

    Scanner s = new Scanner(System.in);
    private String curso;
    private String a[];

    public Curso(int n) {
        curso = "1ºDAW";
        a = new String[n];
        for (int i = 0; i < a.length; i++) {
            int b = i + 1;
            System.out.println("Introduce el nombre del " + b + " alumno");
            a[i] = s.next();
        }
    }

    public void iniciales() {
        for (int i = 0; i < a.length; i++) {
            String cadena = a[i].substring(0, 1) + ".";
            System.out.println(cadena);
        }
    }

    public void desplaza() {
        String aux;
        aux = a[a.length - 1];
        //desplazo todos los elementos a la derecha
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        //pongo en la primera posición "ultimo" que rescaté al principio
        a[0] = aux;
    }

    public String verNombre(int n) {
        return String.valueOf(a[n - 1]);
    }

    public boolean esDaw() {
        int d = curso.toUpperCase().indexOf("DAW");
        boolean daw = false;
        if (d > 0) {
            daw = true;
        }
        return daw;
    }
}
