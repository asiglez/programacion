/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2hoja9.ejercicio1;

/**
 *
 * @author Asier
 */
public class Alarma {
    double temperatura;
    boolean timbre;

    public Alarma(double temperatura) {
        this.temperatura = temperatura;
        timbre=false;
    }
    public void comprueba(){
        if(temperatura>35||temperatura<10){
            this.timbre=true;
            System.out.println("Se ha encendido el timbre debido a que la temperatura es: "+temperatura+" grados");
        }else{
            System.out.println("La temperatura es: "+temperatura+" grados");
        }
    }
    public void normaliza(){
        this.temperatura=25;
        this.timbre=false;
        System.out.println("El timbre se ha apagado y la temperatura se ha establecido a 25 grados");
    }
}
