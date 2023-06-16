/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3hoja1.ejercicio3;

/**
 *
 * @author Asier
 */
public class Llamada {
    int duracion;

    public Llamada() {
        duracion=0;
    }
    public double aPagar(){
        double coste;
        if (duracion<60){
            coste=0.25+((duracion-60)/10*0.1);
        }else{
            coste=0.25;
        }
        return coste;
    }
}
