/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5hoja8.ejercicio1;

/**
 *
 * @author Asier
 */
public class Alumno {

    String nombre;
    int[] notas;

    public Alumno(int n) {
        this.nombre = Teclado.pedirNombre(nombre);
        this.notas = new int[n];
        for (int i = 0; i < notas.length; i++) {
            int a = i + 1;
            System.out.println("Introduce la " + a + " nota");
            notas[i]=Teclado.pedirInt();
        }
    }
    public void mostrar(){
        System.out.println(nombre+": ");
        System.out.print("Notas: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i]);
        }
    }
}
