/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4hoja5.ejercicio1;

/**
 *
 * @author Asier
 */
public class Figura {
    
    char a[][];
    char letra;

    public Figura(char letra, int n) {
        this.letra = letra;
        this.a = new char[n][n];
    }

    public String cuadrado() {
        String result = "";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = letra;
                result = result.concat(String.valueOf(a[i][j]));
            }
            result = result.concat("\n");
        }
        return result;
    }

    public String cuadradoVacio() {
        String result = "";
         for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = ' ';
            }
         }
        for (int i = 0; i < a.length; i++) {
            if (i == 0 || i == a.length - 1) {
                for (int j = 0; j < a[i].length; j++) {
                    a[i][j] = letra;
                }
            } else {
                a[i][0] = letra;
                a[i][a[i].length - 1] = letra;
            }
            for (int j = 0; j < a[i].length; j++) {
                result = result.concat(String.valueOf(a[i][j]));
            }
            result = result.concat("\n");
        }
        return result;
    }

    public String aspa() {
        String result = "";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = ' ';
            }
         }
        for (int i = 0; i < a.length; i++) {
                a[i][i] = letra;
                a[i][a[i].length - i -1] = letra;
            for (int j = 0; j < a[i].length; j++) {
                result = result.concat(String.valueOf(a[i][j]));
            }
            result = result.concat("\n");
        }
        return result;
    }
}
