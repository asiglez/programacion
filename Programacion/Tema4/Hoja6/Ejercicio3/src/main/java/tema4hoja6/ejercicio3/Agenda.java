/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4hoja6.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Agenda {
    
    Scanner s = new Scanner(System.in);
    private Persona[] a;
    int contador;

    public Agenda(int tamaño) {
        this.a = new Persona[tamaño];
        this.contador = 0;
    }

    public void insertar() {
        if (contador < a.length) {
            System.out.println("Introduce el nombre de la persona: ");
            String n = s.next();
            System.out.println("Introduce el telefono de la persona: ");
            String t = s.next();
            Persona p= new Persona(n,t);
            a[contador] = p;
            contador++;
        } else {
            System.out.println("No se pueden añadir más personas a la agenda");
        }
    }

    public void mostrar() {
        for (int i = 0; i < contador; i++) {
            System.out.println("Nombre: " + a[i].getNombre() + " \n"
                    + "Telefono: " + a[i].getTelefono());
        }
    }

    public Persona buscar(String nombre) {
        for (int i = 0; i < contador; i++) {
            if (a[i].getNombre().equals(nombre)) {
                return a[i];
            }
        }
        return null;
    }

    public void modificar(String nombre) {
        Persona persona = buscar(nombre);
        if (persona != null) {
            System.out.println("Introduce el nuevo telefono: ");
            persona.telefono = s.next();
        } else {
            System.out.println("No se ha encontrado ninguna persona con ese nombre en la agenda");
        }
    }
}
