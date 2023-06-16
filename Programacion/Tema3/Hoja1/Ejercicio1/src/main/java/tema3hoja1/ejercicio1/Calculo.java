/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3hoja1.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Calculo {

    Scanner s = new Scanner(System.in);

    public void metodo1() {
        System.out.println("Introduce un numero");
        int numero = s.nextInt();
        if (numero > 100 && numero < 1000) {
            System.out.println("Esta comprendido entre 100 y 1000");
        } else {
            System.out.println("No esta comprendido entre 100 y 1000");
        }
    }

    public void metodo2() {
        System.out.println("Introduce un numero");
        int numero = s.nextInt();
        if (numero < 0) {
            System.out.println("Es negativo");
        }
        if (numero > 0) {
            System.out.println("Es positivo");
        }
        if (numero == 0) {
            System.out.println("Es nulo");
        }
    }

    public void metodo3() {
        System.out.println("Introduce un numero");
        int numero = s.nextInt();
        if (numero % 2 == 0 && numero % 5 == 0) {
            System.out.println("Es divisible entre 2 y 5");
        }
        if (numero % 2 == 0 && numero % 5 != 0) {
            System.out.println("Es divisible entre 2 pero no entre 5");
        }
        if (numero % 2 != 0 && numero % 5 == 0) {
            System.out.println("Es divisible entre 5 pero no entre 2");
        }
        if (numero % 2 != 0 && numero % 5!= 0) {
            System.out.println("No es divisible entre 2 ni entre 5");
        }
    }

    public void metodo4() {
        System.out.println("Introduce un numero(puede llevar decimales)");
        double numero = s.nextDouble();
        if (numero % 1 == 0) {
            System.out.println("No tiene parte fraccionaria");
        } else {
            System.out.println("Tiene parte fraccionaria");
        }
    }

    public void metodo5() {
        System.out.println("Introduce un numero(entre 1900 y 2100)");
        int numero = s.nextInt();
        if (numero > 1899 && numero < 2101) {
            if (numero % 4 == 0 || numero % 100 == 0 && numero % 400 != 0) {
                System.out.println("Es un año bisiesto");
            } else {
                System.out.println("No es un año bisiesto");
            }
        } else {
            System.out.println("No esta en el rango establecido");
        }
    }

    public void metodo6() {
        System.out.println("Introduce un numero");
        int numero = s.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("No es par");
        }
    }

    public void metodo7() {
        System.out.println("Introduce un numero(entre 1 y 10)");
        int numero = s.nextInt();
        if (numero > 0 && numero < 11) {
            if (numero % 2 == 0) {
                System.out.println("Es par");
            } else {
                System.out.println("No es par");
            }
        } else {
            System.out.println("No esta en el rango establecido");
        }
    }

    public void metodo8() {
        System.out.println("Introduce el primer numero");
        int numero1 = s.nextInt();
        System.out.println("Introduce el segundo numero");
        int numero2 = s.nextInt();
        System.out.println("Introduce el tercer numero");
        int numero3 = s.nextInt();
        if (numero1 > numero2 && numero2 > numero3) {
            System.out.println("El orden es:" + numero1 + "," + numero2 + "," + numero3);
        }
        if (numero1 > numero2 && numero2 < numero3 && numero1 > numero3) {
            System.out.println("El orden es:" + numero1 + "," + numero3 + "," + numero2);
        }
        if (numero1 < numero2 && numero1 > numero3) {
            System.out.println("El orden es:" + numero2 + "," + numero1 + "," + numero3);
        }
        if (numero1 < numero2 && numero1 < numero3 && numero2 > numero3) {
            System.out.println("El orden es:" + numero2 + "," + numero3 + "," + numero1);
        }
        if (numero1 < numero2 && numero2 < numero3) {
            System.out.println("El orden es:" + numero3 + "," + numero2 + "," + numero1);
        }
        if (numero1 < numero2 && numero1 < numero3 && numero2 < numero3) {
            System.out.println("El orden es:" + numero3 + "," + numero1 + "," + numero2);
        }if (numero1 == numero2 || numero2 == numero3 || numero1 == numero3) {
            System.out.println("Se repite algun numero");
        }
    }

    public void metodo9() {
        System.out.println("Introduce el primer numero");
        int numero1 = s.nextInt();
        System.out.println("Introduce el segundo numero");
        int numero2 = s.nextInt();
        if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
            if (numero1 % numero2 == 0) {
                System.out.println(numero1 + " es divisible por " + numero2);
            } else {
                System.out.println(numero2 + " es divisible por " + numero1);
            }
        } else {
            System.out.println("No son divisibles");
        }
    }
}
