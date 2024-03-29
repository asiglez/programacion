/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5hoja10.ejercicio1;

import java.util.Arrays;

/**
 *
 * @author Asier
 */
public class Caballo implements PuedeMontarse {
    private final int CAPACIDAD;
    private int ocupacion;
    private Guerrero[] matriz;

    public Caballo(Guerrero[] matriz) {//constructor
        boolean griegos = true;
        this.ocupacion = 0;

        for (int i = 0; i < matriz.length && griegos; i++) {

            if (matriz[i] instanceof Griego) {
                this.ocupacion++;
            } else {
                griegos = false;
            }
        }
        
        if (griegos) {
            this.matriz = matriz;
            this.CAPACIDAD = matriz.length;
        } else {
            this.CAPACIDAD = 100;
            this.matriz = new Guerrero[100];
            this.ocupacion = 0;
        }

    }

    public Caballo(Guerrero guerrero, int newcapacidad) { //constructor
        if (guerrero instanceof Griego && newcapacidad >0) {

            this.matriz = new Guerrero[newcapacidad];           
            this.CAPACIDAD = newcapacidad;
            this.ocupacion = 1;
        } else {
            this.matriz = new Guerrero[newcapacidad];
            this.CAPACIDAD = newcapacidad;
            this.ocupacion = 0;
        }
    }

    public void ordenar() { //ordena el array por fuerza
        System.out.println("Ordenando array...");
        Arrays.sort(matriz,0,ocupacion);
    }

    public int buscar(String nombre) { //busca el nombre de un guerrero
        //int result = -1;
        Arrays.sort(matriz,0,ocupacion);
        return Arrays.binarySearch(matriz, 0, ocupacion, nombre);
        /*for (int i = 0; i < ocupacion; i++) {
            if (this.matriz[i].getNombre().equalsIgnoreCase(nombre)) {
                result = i;
                i = ocupacion;
            }
        }
        return result;*/
    }

    @Override
    public int montar(Guerrero g) { //este metodo recibe un guerrero y comprueba si se puede meter en el caballo, si esta lleno devuelve un -1 y si el guerrero no es griego devuelve un -2
        int result = 0;
        if (g instanceof Griego) {
            if (ocupacion < matriz.length) {
                matriz[ocupacion] = g;
                ocupacion++;
                result = ocupacion;
            } else {
                result = -1;
            }
        }
        if (g instanceof Troyano) {
            
            result = -2;
        }

        return result;
    }

    @Override
    public void desmontar() { //este metodo vacia todo el array del caballo
        /*for (int i = 0; i < matriz.length; i++) {
            matriz[i] = null;
        }*/
        Arrays.fill(matriz,null);
        ocupacion = 0;
    }
}
