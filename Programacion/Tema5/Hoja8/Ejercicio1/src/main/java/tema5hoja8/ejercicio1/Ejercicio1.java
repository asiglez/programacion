/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema5hoja8.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Alumno[] matriz = new Alumno[4];
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = new Alumno(3);
        }

        try {
            System.out.println("Introduce el numero de jugador 1 - " + matriz.length + " que quieres ver: ");
            int n = new Scanner(System.in).nextInt();

            if (n >= 1 && n <= matriz.length) {
                matriz[n].mostrar();
            } else {
                throw new Exception("El numero no esta entre 1 y " + matriz.length);
            }
        } catch (InputMismatchException e) {
            System.out.println("Error No es un numero");
        } catch (Exception e) {
            System.out.println("Error Indeterminado");
        }
    }
}
