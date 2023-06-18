/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema7hoja2.ejercicio2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Asier
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        File fichero = new File("C:Users\\asigu\\OneDrive\\Documentos\\prueba.txt");
        int caracter;
        FileOutputStream f = null;
        System.out.println("escribe lo que quieras grabar en una línea");
        try {
            //genero la salida hacia el fichero
            f = new FileOutputStream(fichero);

            //Escribe hasta que encuentre un salto de linea
            while ((caracter = System.in.read()) != '\n') {
                f.write((char) caracter);
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            if (f != null) {
                try {
                    f.close();
                } catch (IOException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
    }

}
