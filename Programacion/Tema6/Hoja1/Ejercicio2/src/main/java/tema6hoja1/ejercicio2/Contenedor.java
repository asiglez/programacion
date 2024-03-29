/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6hoja1.ejercicio2;

import java.util.Arrays;

/**
 *
 * @author Asier
 */
public class Contenedor<T> implements Pila {

    private T[] matriz;
    private int contador;

    public Contenedor(T[] matriz) {
        this.matriz = matriz;
        contador = 0;
    }

    public void insertarAlPrincipio(T nuevo) {
        matriz = Arrays.copyOf(matriz, matriz.length + 1);
        System.arraycopy(matriz, 0, matriz, 1, matriz.length - 1);

        matriz[0] = nuevo;
        contador++;

    }

    public void insertarAlFinal(T nuevo) {
        matriz = Arrays.copyOf(matriz, matriz.length + 1);
        System.arraycopy(matriz, 0, matriz, 0, matriz.length - 2);
        matriz[matriz.length - 1] = nuevo;
        contador++;
    }

    public T extraerDelPrincipio() {
        T objeto = (T) matriz[0];
        matriz = Arrays.copyOfRange(matriz, 1, matriz.length);
        return objeto;
    }

    public void ordenar() {
        Arrays.sort(matriz);
    }

    @Override
    public String toString() {
        return Arrays.deepToString(matriz);
    }

    @Override
    public void apilar(Object objeto) {
        insertarAlPrincipio((T) objeto);
    }

    @Override
    public Object desapilar() {
        return extraerDelPrincipio();
    }

    @Override
    public boolean estaVacia() {
        boolean result = false;
        if (matriz.length == 0) {
            result = true;
        }
        return result;
    }
}
