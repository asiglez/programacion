/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema4hoja8.ejercicio2;

/**
 *
 * @author Asier
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        Multiplicar a = new Multiplicar();
        a.muestra();
        a.multiplica();
        System.out.println("");
        a.muestra();

        int[] array = a.valoresAspa();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }

        int[] result = a.tablaMultiplicar(5);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ",");
        }
    }
}
