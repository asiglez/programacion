/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4hoja8.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Pais {

    private String nombreP;
    private Ciudad[] ciudades;
    private int nCiudades;
    private int contadorCiudades = 0;

    public Pais() {
        ciudades = new Ciudad[25];
        nCiudades = 0;
    }

    public void addCiudad() {
        if (contadorCiudades < ciudades.length) {

            Scanner teclado = new Scanner(System.in);

            System.out.println("Introduce el nombre de la ciudad: ");
            String nombreCiudad = teclado.nextLine();

            System.out.println("Introduce la latitud de la ciudad: ");
            double latitudCiudad = teclado.nextDouble();

            System.out.println("Introduce la longitud de la ciudad: ");
            double longitudCiudad = teclado.nextDouble();

            System.out.println("Introduce el numero de habitantes de la ciudad: ");
            int habitantesCiudad = teclado.nextInt();

            Ciudad a = new Ciudad(nombreCiudad, latitudCiudad, longitudCiudad, habitantesCiudad);
            ciudades[contadorCiudades] = a;
            contadorCiudades++;
            System.out.println("Ciudad añadida");

        }
    }

    public Ciudad ciudadMasHabitada() {
        int mayor = 0, nciudad = 0;
        for (int i = 0; i < contadorCiudades; i++) {
            if (ciudades[i].getHabitantes() >= mayor) {
                mayor = ciudades[i].getHabitantes();
                nciudad = i;
            }
        }
        return ciudades[nciudad];
    }

    public void ciudadExiste(String nombreCiudad) {
        boolean encontrada = false;
        for (int i = 0; i < contadorCiudades; i++) {

            String comparada = ciudades[i].getNombre().toLowerCase();

            if (comparada.equalsIgnoreCase(nombreCiudad)) {
                encontrada = true;
                i = ciudades.length;

            }

        }
        if (encontrada == false) {
            System.out.println("La ciudad no existe ");
        } else {
            System.out.println("La ciudad Existe ");
        }

    }

    public int mediaHabitantes() {
        int totalHabitantes = 0;
        for (int i = 0; i < contadorCiudades; i++) {
            totalHabitantes += ciudades[i].getHabitantes();
        }
        return totalHabitantes / contadorCiudades;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < contadorCiudades; i++) {
            result.concat(ciudades[i].toString());
        }
        return result;
    }
}
