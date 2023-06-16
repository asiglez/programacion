/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3hoja1.ejercicio4;

/**
 *
 * @author Asier
 */
public class Billete {
    int distancia;
    int dias;

    public Billete(int distancia, int dias) {
        this.distancia = distancia;
        this.dias = dias;
    }
    public double importe(){
        double importe=distancia*0.60;
        if(dias>7 && distancia>800){
            double descuento=importe*0.30;
            importe-=descuento;
        }
        return importe;
    }
}
