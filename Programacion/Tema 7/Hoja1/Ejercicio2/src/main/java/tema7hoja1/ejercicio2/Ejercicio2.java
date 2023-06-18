/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema7hoja1.ejercicio2;

import java.io.File;

/**
 *
 * @author Asier
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        File fichero = new File("D:\\Usuarios\\daw118\\Desktop\\Horario.txt");
        System.out.println("Su nombre: " + fichero.getName() + "\n"
                + "b) Su ruta de acceso: " + fichero.getAbsoluteFile() + "\n"
                + "c) Si es de lectura: " + fichero.canRead() + "\n"
                + "d) Si es de escritura: " + fichero.canWrite() + "\n"
                + "e) Su tamaño: " + fichero.length() + " Bytes ");
    }
}
