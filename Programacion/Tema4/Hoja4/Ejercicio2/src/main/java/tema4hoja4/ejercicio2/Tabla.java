/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4hoja4.ejercicio2;

/**
 *
 * @author Asier
 */
public class Tabla {

    private int a[][] = new int[4][5];

    public Tabla() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = (int) (Math.floor(Math.random() * (100 + 1 - 1)) + 1);
            }
        }
    }

    public void mostrar() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+",");
            }
        }
    }

    public int mayorF(int fila) {
        int mayor = 0;
        for (int j = 0; j < a[fila].length; j++) {
            if (a[fila][j] > mayor) {
                mayor = a[fila][j];
            }
        }
        return mayor;
    }

    public int mayorC(int columna) {
        int mayor = 0;
        for (int j = 0; j < a.length; j++) {
            if (a[j][columna] > mayor) {
                mayor = a[j][columna];
            }
        }
        return mayor;
    }

    public double media() {
        int n = 0;
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                n += a[i][j] ;
                contador++;
            }
        }
        double media = n / contador;
        return media;
    }
}
