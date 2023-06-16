/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3hoja3.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Calculo {

    Scanner s = new Scanner(System.in);

    public Calculo() {
    }

    public void metodo1() {
        int i = 10;
        while (i >= 0) {
            System.out.println(i);
            i--;
        }
        System.out.println("¡DESPEGUE!");
    }

    public void metodo2() {
        int i = 1;
        int contadorpositivo = 0;
        int contadornegativo = 0;
        int contadornulo = 0;
        while (i >= 10) {
            System.out.println("Introduce un numero");
            int n = s.nextInt();
            if (n > 0) {
                contadorpositivo++;
            }
            if (n < 0) {
                contadornegativo++;
            }
            if (n == 0) {
                contadornulo++;
            }
            i++;
        }
        System.out.println("Positivos: " + contadorpositivo + "\n"
                + "Negativos: " + contadornegativo + "\n"
                + "Nulos: " + contadornulo);
    }

    public void metodo3() {
        System.out.println("Introduce un numero");
        int n = s.nextInt();
        int a = n - 1;
        while (a >= 1) {
            n *= a;
            a--;
        }
        System.out.println(n);
    }

    public void metodo4() {
        System.out.println("Introduce la frase");
        String frase = s.nextLine();
        int posicionPunto = frase.lastIndexOf(".");
        String frasefinal = frase.substring(0, posicionPunto);
        int charfinal = frasefinal.length();
        System.out.println("los caracteres de la frase son: " + charfinal);
    }

    public void metodo5() {
        System.out.println("Introduce un numero :");
        int n = s.nextInt();
        int totalN = 0;
        int contadorN = 0;
        while (n >= 0) {
            System.out.println("Introduce un numero :");
            n = s.nextInt();
            if (n >= 0) {
                //si el numero es positivo,sumo n al total
                totalN += n;
            }
            //incremento el contador de numeros introducidos
            contadorN++;
        }
        if (n>0){
        int result = totalN / contadorN;
        System.out.println("la media de todos los numeros introducidos es:" + result);
        }else {
            System.out.println(" La suma de los numeros es 0");
        }
    }
}
