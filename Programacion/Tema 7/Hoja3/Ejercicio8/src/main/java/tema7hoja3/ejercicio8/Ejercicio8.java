/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema7hoja3.ejercicio8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        File fichero = new File("C:Users\\asigu\\OneDrive\\Documentos\\prueba.txt");
        if (fichero.exists()) {
            ArrayList<String> lista = new ArrayList();
            BufferedReader br = null;

            String linea;
            try {
                br = new BufferedReader(new FileReader(fichero));
                //mientras el string que viene por el buffer no sea null se sigue
                while ((linea = br.readLine()) != null) {
                    lista.add(linea);
                }

            } catch (FileNotFoundException fnfe) {
                System.out.println("Error, el fichero no existe");
            } catch (IOException ex) {
                System.err.println(ex.toString());
            } finally {
                if (br != null) {
                    try {
                        br.close();
                    } catch (IOException ex) {
                        System.out.println("Error al cerrar");
                    }
                }
            }

            System.out.println("Introduce una opcion...");
            int opcion = 0;
            do {
                System.out.println("1- Añadir un nuevo nombre\n"
                        + "        2- Borrar un nombre\n"
                        + "        3- Salir");
                System.out.println("Introduce una opcion");

                opcion = new Scanner(System.in).nextInt();

                switch (opcion) {
                    case 1 -> {
                        System.out.println("Introduce el nombre del nuevo socio..");
                        String nombre = new Scanner(System.in).nextLine();
                        if (lista.add(nombre)) {
                            System.out.println("Socio añadido...");
                        } else {
                            System.out.println("Error socio no añadido");
                        }

                    }
                    case 2 -> {
                        System.out.println("Introduce el nombre del socio que quieres eliminar..");
                        String nombre = new Scanner(System.in).nextLine();

                        boolean encontrado = false;
                        Iterator<String> it = lista.iterator();
                        while (it.hasNext() && !encontrado) {
                            String persona = it.next();
                            if (persona.equalsIgnoreCase(nombre)) {
                                encontrado = true;
                                it.remove();
                            }
                        }
                    }
                    case 3 -> {
                        BufferedWriter brw = null;
                        try {
                            brw = new BufferedWriter(new FileWriter(fichero));

                            for (String cadena : lista) {
                                brw.write(cadena);
                                brw.write(System.lineSeparator());
                            }

                            System.out.println("Adios...");
                        } catch (IOException ex) {
                            System.err.println(ex.toString());
                        } finally {
                            if (brw != null) {
                                try {
                                    brw.close();
                                } catch (IOException ex) {
                                    System.out.println("Error al cerrar");
                                }
                            }
                        }
                    }

                    default -> {
                        System.out.println("Opcion no valida...");
                    }
                }

            } while (opcion != 3);
        } else {
            System.out.println("El fichero no existe");
        }
    }
}
