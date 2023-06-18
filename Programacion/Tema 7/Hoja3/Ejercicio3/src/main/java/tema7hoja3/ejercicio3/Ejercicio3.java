/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema7hoja3.ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Asier
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        File fichero1 = new File("C:Users\\asigu\\OneDrive\\Documentos\\prueba.txt");
        File fichero2 = new File("C:Users\\asigu\\OneDrive\\Documentos\\prueba1.txt");
        BufferedReader brr = null;
        String lineaLeida;

        BufferedWriter brw = null;

        try {
            //hago los dos ficheros uno que se lee y otro que  se escribe
            brr = new BufferedReader(new FileReader(fichero1));
            brw = new BufferedWriter(new FileWriter(fichero2));

            while ((lineaLeida = brr.readLine()) != null) {
                //cogo la linea que he leido y la escribo
                brw.write(lineaLeida);
                brw.write(System.lineSeparator());
            }

        } catch (FileNotFoundException fnfe) {
            System.out.println("Error, el fichero no existe");
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            //cierro los dos ficheros
            if (brr != null) {
                try {
                    brr.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar");
                }
            }
            if (brw != null) {
                try {
                    brw.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar");
                }
            }
        }
    }
}
