/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema7hoja1.ejercicio4;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        System.out.println("Introduce la ruta absoluta");
        String StringRuta = new Scanner(System.in).nextLine();

        String tabulaciones = "";
        String directorio = StringRuta;

        ListarSubdirectorio(directorio, tabulaciones);

    }

    public static void ListarSubdirectorio(String ruta, String tabulaciones) {

        String newtabulaciones = tabulaciones;
        newtabulaciones = newtabulaciones.replace('-', ' ').replace('|', ' ');

        newtabulaciones = newtabulaciones.concat(newtabulaciones + "|----");

        File rutaAux = new File(ruta);
        File[] matrizDirectorio = rutaAux.listFiles();

        //System.out.println(tabulaciones + "Subdirectorio : " + rutaAux.getName());
        for (File auxFichero : matrizDirectorio) {
            if (auxFichero.isFile()) {

                //genero el print del fichero
                String soutFichero = "";
                soutFichero = soutFichero.concat(tabulaciones + "Fichero -> " + auxFichero.getName());
                System.out.println(soutFichero);

            } else {
                //genero el print del directorio
                String soutDir = "";
                soutDir = soutDir.concat(tabulaciones + "Directorio -> " + auxFichero.getName());
                System.out.println(soutDir);

                //genero la nueva ruta del directorio encontrado
                String directorioAux = "";
                directorioAux = directorioAux.concat(ruta + "\\" + auxFichero.getName());

                //llamo a esta misma funcion
                ListarSubdirectorio(directorioAux, newtabulaciones);
            }
        }
    }
}
