/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema3hoja5.ejercicio4;

/**
 *
 * @author Asier
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100;i+=10) {
            System.out.println("Ciclo Nº"+ i);
            for (int a=1; a <= 10; a++) {
                int suma=a+i-1;
                System.out.println(suma);
            }
        }
    }
}
