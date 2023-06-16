/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4hoja2.ejercicio1;

/**
 *
 * @author Asier
 */
public class Operaciones {

    int a[] = new int[5];

    public Operaciones(int a1, int a2, int a3, int a4, int a5) {
        this.a[0] = a1;
        this.a[1] = a2;
        this.a[2] = a3;
        this.a[3] = a4;
        this.a[4] = a5;
    }

    public void multiplicar() {
        for (int i = 0; i < a.length; i++) {
            int m = a[i];
            m *= 2;
            a[i] = m;
        }
    }

    public void mostrar() {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public int pares() {
        int suma=0;
        for (int i = 0; i < a.length; i++) {

            if (i % 2 == 0) {
                suma += a[i];
            }
        }
        return suma;
    }
}
