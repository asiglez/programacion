/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4hoja2.ejercicio2;

/**
 *
 * @author Asier
 */
public class Vectores {

    int a[] = new int[5];

    public Vectores(int a1, int a2, int a3, int a4, int a5) {
        this.a[0] = a1;
        this.a[1] = a2;
        this.a[2] = a3;
        this.a[3] = a4;
        this.a[4] = a5;
    }

    public int menor() {
        int m = 1000;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= m) {
                m = a[i];
            }
        }
        return m;
    }

    public int mayor() {
        int m = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= m) {
                m = a[i];
            }
        }
        return m;
    }

    public double media() {
        int n = 0;
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            n += a[i];
            contador++;
        }
        double media=n/contador;
        return media;
    }
}
