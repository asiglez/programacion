/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema4hoja1.ejercicio7;

/**
 *
 * @author Asier
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int c = 0; c < a.length; c++) {
            for (int i = 0; i < a.length - c - 1; i++) {
                if (a[i] <= a[i + 1]) {    //comparo los numeros , si el numero actual es mayor al siguiente, intercambio sus posiciones
                    int aux = a[i + 1];       //esto nos deja con el numero mayor en la ultima posicion del array, en el siguiente comienzo el bucle, esta posicion no se tomara en cuenta
                    a[i + 1] = a[i];
                    a[i] = aux;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");

        }
    }
}
