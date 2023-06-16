/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3hoja4.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Metodo {

    Scanner s = new Scanner(System.in);

    public void metodo1() {
        System.out.println("Introduce un numero");
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    public void metodo2() {
        System.out.println("Introduce un numero");
        int n1 = s.nextInt();
        System.out.println("Introduce otro numero");
        int n2 = s.nextInt();
        int sumaimpares = 0;
        if (n1 > n2) {
            for (int i = n2; i <= n1; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
                sumaimpares += i;
            }
            System.out.println(sumaimpares);
        }
        if (n2 > n1) {
            for (int i = n1; i <= n2; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
                sumaimpares += i;
            }
            System.out.println(sumaimpares);
        }
        if (n1 == n2) {
            System.out.println("Son el mismo numero");
        }
    }

    public void metodo3() {
        System.out.println("Introduce un numero positivo");
        int n = s.nextInt();
        if (n > 0) {
            for (int i = 1; i <= 10; i++) {
                int resultado = n * i;
                System.out.println(n + " x " + i + " = " + resultado);
            }
        } else {
            System.out.println("No es un numero positivo");
        }
    }

    public void metodo4() {
        System.out.println("Introduce un numero");
        int a = s.nextInt();
        System.out.println("Introduce otro numero");
        int b = s.nextInt();
        int resto = a; //le doy al resto el valor el divisor
        for (int contador = 0; contador <= a / b; contador++) {
            System.out.println("el resto es : " + resto + " el cociente es: " + contador);
            resto -= b; //resto al divisor el dividendo,para dar el resto
        }

    }
}
