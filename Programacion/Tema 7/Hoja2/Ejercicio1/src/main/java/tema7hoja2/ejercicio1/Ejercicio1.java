/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema7hoja2.ejercicio1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Asier
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int caracter;
        File fichero = new File("C:Users\\asigu\\OneDrive\\Documentos\\prueba.txt");
        FileInputStream f = null;
        try {
            f = new FileInputStream(fichero);
            while ((caracter = f.read()) != -1) {
                System.out.print((char) caracter);
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            if (f != null) {
                try {
                    f.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar el fichero.");
                }
            }
        }
    }
}
