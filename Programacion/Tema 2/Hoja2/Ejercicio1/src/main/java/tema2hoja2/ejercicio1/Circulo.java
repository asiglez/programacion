/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2hoja2.ejercicio1;

/**
 *
 * @author Asier
 */
public class Circulo {
    private double radio;
    
    public Circulo(){ //Es el constructor sin parametros y sirve para crear la clase
        this.radio=radio;
    }
    
    public Circulo(double radio){ //Es el constructor con parametros y sirve para crear la clase
        this.radio=radio;
    }

    public double getRadio() { //Devuelve el radio del circulo
        return radio;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    public double area(){
        return Math.PI*Math.pow(radio, 2);
    }
    
    public double longitud(){
        return 2*Math.PI*radio;
    }
}
