/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2hoja6.ejercicio1;

/**
 *
 * @author Asier
 */
public class Taller {

    int aceite;
    int ruedas;
    int contadorCambiosTotales;
    int contadorCambiosParciales;

    public Taller(int aceite, int ruedas) {
        this.aceite = aceite * 5;
        this.ruedas = ruedas;
        this.contadorCambiosTotales = 0;
        this.contadorCambiosParciales = 0;
    }

    public void addAceite(int incA) {
        this.aceite += incA * 5;
    }

    public void addRuedas(double incR) {
        this.ruedas += incR;
    }

    public int getCambioCompletos() {
        int coches = 0;
        int cochesA = aceite / 3;
        int cochesR = ruedas / 4;
        if (cochesA >= cochesR) {
            coches = cochesA;
        } else {
            coches = cochesR;
        }
        return coches;
    }

    public int getCambioParcial() {
        int coches = 0;
        int cochesA = aceite / 3;
        int cochesR = ruedas / 2;
        if (cochesA >= cochesR) {
            coches = cochesA;
        } else {
            coches = cochesR;
        }
        return coches;
    }

    public void cambioCompleto() {
        if (aceite - 3 >= 0 && ruedas - 4 >= 0) {
            this.aceite -= 3;
            this.ruedas -= 4;
            this.contadorCambiosTotales++;
        } else {
            System.out.println("No se puede hacer un cambio completo");
        }
    }

    public void cambioParcial() {
        if (aceite - 3 >= 0 && ruedas - 2 >= 0) {
            this.aceite -= 3;
            this.ruedas -= 2;
            this.contadorCambiosParciales++;
        } else {
            System.out.println("No se puede hacer un cambio parcial");
        }
    }

    public int getAceite() {
        return aceite;
    }

    public int getRuedas() {
        return ruedas;
    }

    @Override
    public String toString() {
        double ingresos = (contadorCambiosTotales * ((4.50 * 3 + 50 * 4)) + contadorCambiosParciales * (5 * 3 + 60 * 2));
        return "TALLER \n"
                + "EXISTENCIAS \n"
                + "     Ruedas: " + ruedas + " unidades. \n"
                + "     Aceite: " + aceite + " litros. \n"
                + "INGRESOS: Total: " + ingresos + "€";
    }

    public Taller(Taller t) {
        this.aceite = t.aceite;
        this.ruedas = t.ruedas;
        this.contadorCambiosTotales = 0;
        this.contadorCambiosParciales = 0;
    }
}
