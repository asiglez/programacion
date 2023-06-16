/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema3hoja4.ejercicio6;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

/**
 *
 * @author Asier
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce una apuesta");
        int apuesta = s.nextInt();
        for (boolean a = true; a == true;) {
            int resultadoApuesta = (int) Math.floor(Math.random() * 2) + 1;
            if (resultadoApuesta == 1) {
                apuesta *= 2;
                System.out.println("Has ganado: " + apuesta);
                System.out.println("¿Quieres continuar(true/false)?");
                a = s.nextBoolean();
            }
            if (resultadoApuesta == 2) {
                apuesta = 0;
                System.out.println("Has perdido todo");
                System.out.println("¿Quieres continuar(true/false)?");
                a = s.nextBoolean();
                if (a == true) {
                    System.out.println("Introduce una apuesta");
                    apuesta = s.nextInt();
                }
            }
        }
    }
}
