/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema7hoja1.ejercicio1;

import java.io.File;

/**
 *
 * @author Asier
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        File fichero = new File("C:Users\\asigu\\OneDrive\\Documentos\\prueba.txt");
        if (fichero.exists()) {
            System.out.println("El fichero existe");
        } else {
            System.out.println("El fichero no existe");
        }
    }
}
