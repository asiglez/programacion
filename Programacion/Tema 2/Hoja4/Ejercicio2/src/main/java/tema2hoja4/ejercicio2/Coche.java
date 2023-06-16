/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2hoja4.ejercicio2;

/**
 *
 * @author Asier
 */
public class Coche {
    private String matricula;
    private int velocidad;
    public Coche(String matricula, int velocidad){
        this.matricula=matricula;
        this.velocidad=velocidad;
    }
    public Coche(String matricula){
        this.matricula=matricula;
        this.velocidad=0;
    }
    public void acelera(int v){
        if(velocidad+v<=120){
            velocidad+=v;
        }
        else{
            this.velocidad=120;
        }
    }
    public void frena(int v){
        if(velocidad-v>=0){
            velocidad-=v;
        }
        else{
            this.velocidad=0;
        }
    }
    public void letras(){
        String letras=matricula.substring(4,7);
        System.out.println("Las letras de la matricula son: "+letras);
    }
    public void mostrar(){
        System.out.println("Coche [matricula="+matricula+", velocidad="+velocidad+"]");
    }
}
