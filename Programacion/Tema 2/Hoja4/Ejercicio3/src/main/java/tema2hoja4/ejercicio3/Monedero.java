/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2hoja4.ejercicio3;

/**
 *
 * @author Asier
 */
public class Monedero {

    double dinero;

    public Monedero(double dinero) {
        this.dinero = dinero;
    }

    public void ingresar(double ingreso) {
        this.dinero += ingreso;
        System.out.println("Añado al monedero "+ingreso+" euros");
    }

    public void sacar(double sacar) {
        System.out.println("Intento sacar "+sacar+" euros");
        if (dinero - sacar >= 0) {
            this.dinero -= sacar;
        } else {
            System.out.println("No hay saldo suficiente");
        }
    }
    public void mostrar() {
        System.out.println("Tienes =" + dinero);
    }
}
