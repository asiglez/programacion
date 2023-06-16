/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4hoja3.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Comunidad {

    Scanner s = new Scanner(System.in);
    String comunidad;
    String a[];

    public Comunidad(String comunidad, int provincias) {
        this.comunidad = comunidad;
        a = new String[provincias];
        for (int i = 0; i < a.length; i++) {
            int b = i + 1;
            System.out.println("Introduce el nombre de la " + b + " provincia");
            a[i] = s.next();
        }
    }

    public String mostrar() {
        String cadena = comunidad.toUpperCase() + ": ";
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i].length() >= 4) {
                cadena = cadena.concat(a[i].substring(0, 4).toUpperCase().concat(" "));
            } else {
                cadena = cadena.concat(String.valueOf(a[i].length()).concat(" "));
            }
        }
        return cadena;
    }

    public String sorteo() {
        int n=(int) Math.floor(Math.random()*(3-0+1)+0);
        String cadena=a[n];
        return cadena;
    }
    public int buscar(String provincia){
        int posicion=-1;
        for(int i=0;i<a.length;i++){
            boolean p=a[i].equalsIgnoreCase(provincia);
            if(p==true){
                posicion=i;
            }
        }
        return posicion;
    }
}
