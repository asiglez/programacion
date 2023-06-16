/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4hoja3.ejercicio4;

/**
 *
 * @author Asier
 */
public class Bonoloto {

    private int a[] = new int[6];

    public Bonoloto() {
        for (int i = 0; i < a.length; i++) {
            int random = (int) Math.floor(Math.random() * 49) + 1;
            if (i == 0) {
                a[0] = random;
            } //si estoy en el primer elemento del array, le asigno el valor random directamente
            else { //si no estoy en el primer elemento del array ejecuto lo siguiente->

                for (int j = 0; j <= i; j++) { //genero un for que compare el numero random por cada numero que ya tengo introducido en el array

                    if (a[j] == random) { //si el numero random es igual al elemento en la posicion J, repito el for con otro numero random
                        j = -1;
                        random = (int) Math.floor(Math.random() * 49) + 1; //genero el aleatorio   
                    } else if (j == i && a[j] != random) { //si he llegado al final del for y el elemento al final del for es diferente al random , le asigno
                        a[i] = random;
                    }
                }
            }
        }
    }

    public String mostrar() {
        String cadena = "";
        for (int i = 0; i < a.length; i++) {
            cadena = cadena.concat(String.valueOf(a[i]).concat(", "));
        }
        return cadena;
    }

}
