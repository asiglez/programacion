/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6hoja1.ejercicio1;

import java.util.Arrays;

/**
 *
 * @author Asier
 */
public class Contenedor<T> {

    private T[] a;
    private int contador;

    public Contenedor(T[] a) {
        this.a = a;
        contador = 0;
    }

    public void insertarAlPrincipio(T nuevo) {
        a = Arrays.copyOf(a, a.length + 1);
        System.arraycopy(a, 0, a, 1, a.length - 1);

        a[0] = nuevo;
        contador++;

    }

    public void insertarAlFinal(T nuevo) {
        a = Arrays.copyOf(a, a.length + 1);

        a[a.length - 1] = nuevo;
        contador++;
    }

    public T extraerDelPrincipio() {
        T objeto = (T) a[0];
        a = Arrays.copyOfRange(a, 1, a.length);
        return objeto;
    }

    public void ordenar() {
        Arrays.sort(a);
    }

    @Override
    public String toString() {
        return Arrays.deepToString(a);
    }
}
