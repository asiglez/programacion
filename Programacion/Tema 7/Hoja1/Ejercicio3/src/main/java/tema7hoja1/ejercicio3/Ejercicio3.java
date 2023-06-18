/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema7hoja1.ejercicio3;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Asier
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        File fichero = new File("C:Users\\asigu\\OneDrive\\Documentos\\prueba.txt");

        try {
            if (fichero.createNewFile()) {
                System.out.println("Fichero creado");
            } else {
                System.out.println("Error, no se puede crear el fichero");
            }

        } catch (IOException IOE) {
            System.out.println(IOE.getMessage());
        }
    }
}
