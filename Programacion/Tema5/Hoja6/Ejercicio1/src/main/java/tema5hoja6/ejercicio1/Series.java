/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tema5hoja6.ejercicio1;

/**
 *
 * @author Asier
 */
public interface Series {

    int inicio = 0;

    public abstract int getSiguiente();

    public abstract void reiniciar();

    public abstract void setComenzar(int x);

    default public void mostrarInicio() {
        System.out.println("Inicio: " + inicio);
    }

    public static void nombreInterfaz() {
        System.out.println(" Interfaz Series ");
    }
;
}
