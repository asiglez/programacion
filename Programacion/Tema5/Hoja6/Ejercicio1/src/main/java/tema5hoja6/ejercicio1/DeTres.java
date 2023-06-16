/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5hoja6.ejercicio1;

/**
 *
 * @author Asier
 */
public class DeTres implements Series {

    int valor;

    public DeTres() {
        valor = inicio;
    }

    @Override
    public int getSiguiente() {
        valor += 3;
        return valor;
    }

    @Override
    public void reiniciar() {
        valor = inicio;
        System.out.println("Serie reinciada");
    }

    @Override
    public void setComenzar(int x) {
        valor = x;
        System.out.println("Serie comenzada con " + x);
    }

    @Override
    public void mostrarInicio() {
        System.out.println("inicio " + valor);
    }
}
