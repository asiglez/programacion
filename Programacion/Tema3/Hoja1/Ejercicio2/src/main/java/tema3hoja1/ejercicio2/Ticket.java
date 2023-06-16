/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3hoja1.ejercicio2;

/**
 *
 * @author Asier
 */
public class Ticket {
    double naranja;

    public Ticket(double naranja) {
        this.naranja = naranja;
    }
    public String imprimir(){
        double importe;
        if(naranja>10){
            importe=naranja*1.2;
        }else{
            importe=naranja*1.5;
        }
        return "Se han vendido: "+naranja+" kilos de naranja \n"
                +"El importe total es: "+importe;
    }
}
