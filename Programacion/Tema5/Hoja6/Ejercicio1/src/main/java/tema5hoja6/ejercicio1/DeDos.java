/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5hoja6.ejercicio1;

/**
 *
 * @author Asier
 */
public class DeDos implements Series {

    int valor;
    int anterior;

    public DeDos() {
        valor = inicio;
        anterior = inicio - 2;
    }

    public int getAnterior() {
        return anterior;
    }

    @Override
    public int getSiguiente() {
        anterior = valor;
        valor += 2;
        return valor;
    }

    @Override
    public void reiniciar() {
        anterior = inicio - 2;
        valor = inicio;
        System.out.println("Serie reinciada");
    }

    @Override
    public void setComenzar(int x) {
        valor = x;
        anterior = x - 2;
        System.out.println("Serie comenzada con " + x);
    }

}
