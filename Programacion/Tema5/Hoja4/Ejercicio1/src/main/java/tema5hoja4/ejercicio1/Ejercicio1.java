/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema5hoja4.ejercicio1;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Publicacion[] a = new Publicacion[5];
        for (int i = 0; i < 5; i++) {

            System.out.println("Que quieres insertar un disco (1) o un libro (2)");
            int opcion = s.nextInt();

            if (opcion == 1) {
                System.out.println("Quieres insertar un disco...........");

                System.out.println("introduce el titulo: ");
                String titulo = s.nextLine();
                System.out.println("introduce el autor: ");
                String autor = s.nextLine();
                System.out.println("introduce el dia: ");
                int dia = s.nextInt();
                System.out.println("introduce el mes: ");
                int mes = s.nextInt();
                System.out.println("introduce el año: ");
                int año = s.nextInt();
                System.out.println("introduce el duracion minutos: ");
                int duracion = s.nextInt();

                a[i] = new Disco(duracion, titulo, autor, dia, mes, año);
            } else {
                System.out.println("Quieres insertar un libro.......");

                System.out.println("introduce el titulo: ");
                String titulo = new Scanner(System.in).nextLine();
                System.out.println("introduce el autor: ");
                String autor = new Scanner(System.in).nextLine();
                System.out.println("introduce el dia: ");
                int dia = new Scanner(System.in).nextInt();
                System.out.println("introduce el mes: ");
                int mes = new Scanner(System.in).nextInt();
                System.out.println("introduce el año: ");
                int año = new Scanner(System.in).nextInt();
                System.out.println("introduce el numero de paginas: ");
                int npaginas = new Scanner(System.in).nextInt();

                a[i] = new Libro(npaginas, titulo, autor, dia, mes, año);
            }
        }

        System.out.println("Muestro los datos de todos las publicaciones");

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].toString()); //muestro los datos de las publicaciones
        }

        System.out.println("Muestro los datos del disco con mas duracion");
        int mayortiempo = 0;
        int posicionmayor = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] instanceof Disco discaux) {
                if (discaux.getDuracionMinutos() >= mayortiempo) {
                    mayortiempo = discaux.getDuracionMinutos();
                    posicionmayor = i;
                }
            }
        }

        if (a[posicionmayor] instanceof Disco discaux) {
            if (discaux.getAutor().length() >= 3) {
                System.out.println(" 3 primeras letras del autor: " + discaux.getAutor().substring(0, 3));
            } else {
                System.out.println("El autor no tiene mas de 3 letras");
            }
            if (discaux.getTitulo().length() >= 3) {
                System.out.println(" 3 primeras letras del titulo: " + discaux.getTitulo().substring(0, 3));
            } else {
                System.out.println("El titulo no tiene mas de 3 letras");
            }
        }

        System.out.println("Muestro los libros editados en febrero que tengan mas de 1000 paginas");
        for (int i = 0; i < a.length; i++) {
            if (a[i] instanceof Libro libroaux) {
                if (libroaux.getFecha().getMonthValue() == LocalDate.now().getMonthValue()
                        && libroaux.getFecha().getYear() == LocalDate.now().getYear()
                        && libroaux.getNumPaginas() >= 1000) {

                    System.out.println("Titulo: " + libroaux.getTitulo() + " Autor: " + libroaux.getAutor());
                }
            }

        }

        System.out.println("Muestro los discos editados en los ultimos 2 años");
        for (int i = 0; i < a.length; i++) {
            if (a[i] instanceof Disco discoaux) {
                if (discoaux.getFecha().isAfter(LocalDate.now().minusYears(2))) {//la fecha actual menos 2 años
                    System.out.println("Titulo: " + discoaux.getTitulo() + " Autor: " + discoaux.getAutor());
                }
            }

        }
    }
}
