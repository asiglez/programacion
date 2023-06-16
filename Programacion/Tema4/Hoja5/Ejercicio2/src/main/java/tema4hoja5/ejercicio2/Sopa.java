/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4hoja5.ejercicio2;

import java.util.Random;

/**
 *
 * @author Asier
 */
public class Sopa {

    Random random = new Random();
    char a[][];

    public Sopa() {
        this.a = new char[10][20];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                int aleatorio = random.nextInt(26);//0 ->25
                char letraAleatoria = (char) ('A' + aleatorio);
                a[i][j] = letraAleatoria;
            }
        }
    }

    public Sopa(int filas, int columnas) {
        this.a = new char[filas][columnas];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                int aleatorio = random.nextInt(26);//0 ->25
                char letraAleatoria = (char) ('A' + aleatorio);
                a[i][j] = letraAleatoria;
            }
        }
    }

    public void mostrar() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(String.valueOf(a[i][j]));
            }
            System.out.println("");
        }
    }

    public void setPalabra(String palabra, int x, int y, int d) {
        int fila = x;
        int columna = y;
        if (d == 1) {
            if (palabra.length() <= a[x].length - y + 1) {
                for (int i = 0; i < palabra.length(); i++) {
                    a[fila][columna] = palabra.charAt(i);
                    columna++;
                }
            } else {
                System.out.println("La palabra no entra en la sopa de letras.");
            }
        }
        if (d == -1) {
            if (palabra.length() <= a.length - x + 1) {
                for (int i = 0; i < palabra.length(); i++) {
                    a[fila][columna] = palabra.charAt(i);
                    fila++;
                }
            } else {
                System.out.println("La palabra no entra en la sopa de letras.");
            }

        }
        if (d != 1 && d != -1) {
            System.out.println("Has introducido mal la direccion tiene que ser 1 si es horizontal y -1 si es vertical.");
        }
    }
}
