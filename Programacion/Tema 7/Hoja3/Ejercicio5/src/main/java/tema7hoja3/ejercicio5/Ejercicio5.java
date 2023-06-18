/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema7hoja3.ejercicio5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Asier
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        File fichero = new File("C:Users\\asigu\\OneDrive\\Documentos\\prueba.txt");
        BufferedReader brr = null;
        String lineaLeida;

        try {
            brr = new BufferedReader(new FileReader(fichero));
            int linea = 0;
            while ((lineaLeida = brr.readLine()) != null) {

                System.out.println("La linea " + linea + " tiene : " + lineaLeida.split(" ").length + " palabras");
                linea++;
            }
            System.out.println("Y el fichero tiene " + linea + " lineas");

        } catch (FileNotFoundException fnfe) {
            System.out.println("Error, el fichero no existe");
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            if (brr != null) {
                try {
                    brr.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar");
                }
            }
        }
    }
}
