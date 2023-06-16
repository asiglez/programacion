/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4hoja3.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Triatlon {

    Scanner s = new Scanner(System.in);
    int dorsal;
    String nombre;
    int a[];

    public Triatlon(int dorsal, String nombre, int pruebas) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.a = new int[pruebas];
        for (int i = 0; i < a.length; i++) {
            int p = i + 1;
            System.out.println("Introduce la" + p + "puntuacion");
            a[i] = s.nextInt();
        }
    }

    public Triatlon() {
        System.out.println("Introduce el dorsal");
        this.dorsal = s.nextInt();
        System.out.println("Introduce el nombre");
        this.nombre = s.next();
        System.out.println("Introduce el numero de pruebas");
        this.a = new int[s.nextInt()];
        for (int i = 0; i < a.length; i++) {
            int p = i + 1;
            System.out.println("Introduce la " + p + " puntuacion");
            a[i] = s.nextInt();
        }
    }

    public double pMedia() {
        int n = 0;
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            n += a[i];
            contador++;
        }
        double media = n / contador;
        return media;
    }

    public boolean esSelecionado() {
        boolean puntuacion = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 10) {
                puntuacion = true;
            }
        }
        return puntuacion;
    }
    public String mostrar(){
        String cadena = "";
        for (int i = 0; i < a.length; i++) {
            cadena = cadena.concat(String.valueOf(a[i]) + ",");
        }
        return "Dorsal="+String.valueOf(dorsal)+" Nombre="+nombre+" Puntos="+cadena+" Media="+pMedia();
    }
}
