/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema2hoja9.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Introduce la temperatura: ");
        Alarma a= new Alarma(s.nextInt());
        a.comprueba();
        if(a.timbre==true){
            a.normaliza();
        }
    }
}
