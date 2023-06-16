/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5hoja5.ejercicio1;

/**
 *
 * @author Asier
 */
public class AutoAnfibio implements TransporteMaritimo, TransporteTerrestre {

    public String marca;
    public String modelo;

    public AutoAnfibio(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public void nadar() {
        System.out.println("Estoy nadando");
    }

    @Override
    public void andar() {
        System.out.println("Estoy andando");
    }
}
