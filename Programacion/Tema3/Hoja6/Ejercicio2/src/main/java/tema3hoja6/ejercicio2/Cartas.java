/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3hoja6.ejercicio2;

/**
 *
 * @author Asier
 */
public class Cartas {

    double numero;
    double palo;
    public Cartas() {
        this.numero = Math.floor(Math.random() * 10) + 1;
        this.palo = Math.floor(Math.random() * 4) + 1;
    }

    public String mostrar() {
        String carta="";
        if (palo == 1) {
            carta = numero + " de Oros";
        }
        if (palo == 2) {
            carta = numero + " de Copas";
        }
        if (palo == 3) {
            carta = numero + " de Espadas";
        }
        if (palo == 4) {
            carta = numero + " de Bastos";
        }
        return carta;
    }

    public double getNumero() {
        return numero;
    }

    public double getPalo() {
        return palo;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public void setPalo(double palo) {
        this.palo = palo;
    }
}
