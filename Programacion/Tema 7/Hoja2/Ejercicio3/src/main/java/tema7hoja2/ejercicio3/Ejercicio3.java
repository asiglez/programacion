/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema7hoja2.ejercicio3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Asier
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        File fichero1 = new File("C:Users\\asigu\\OneDrive\\Documentos\\prueba.txt");
        File fichero2 = new File("C:Users\\asigu\\OneDrive\\Documentos\\prueba1.txt");

        int caracter;

        FileInputStream fIn = null;
        FileOutputStream fOut = null;

        try {
            //hago los dos ficheros uno que se lee y otro que  se escribe
            fIn = new FileInputStream(fichero1);
            fOut = new FileOutputStream(fichero2);

            while ((caracter = fIn.read()) != -1) {
                //los caracteres que cojo del primer fichero lo escribo en el segundo fichero hasta que no quede ninguno
                fOut.write((char) caracter);
            }

        } catch (FileNotFoundException fnfe) {
            System.out.println("Error, el fichero no existe");
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            //cierro los dos ficheros
            if (fIn != null) {
                try {
                    fIn.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar el fichero.");
                }
            }
            if (fOut != null) {
                try {
                    fOut.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar el fichero.");
                }
            }
        }
    }
}
