/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2hoja5.ejercicio1;

/**
 *
 * @author Asier
 */
public class Restaurante {

    int huevos;
    double chorizo;

    public Restaurante(int huevos, double chorizo) {
        this.huevos = huevos;
        this.chorizo = chorizo;
    }

    public void addHuevos(int incH) {
        this.huevos += incH;
    }

    public void addChorizos(double incC) {
        this.chorizo += incC;
    }

    public int getNumPlatos() {
        int platos = 0;
        int platosH = huevos / 2;
        int platosC = (int) (chorizo * 1000 / 200);
        if (platosH >= platosC) {
            platos = platosH;
        } else {
            platos = platosC;
        }
        return platos;
    }

    public void sirvePlato() {
        if(huevos-2>=0 && chorizo-0.200>=0){
        this.huevos-=2;
        this.chorizo-=0.200;
        }else{
            System.out.println("No se puede servir un plato");
        }
    }

    public int getHuevos() {
        return huevos*12;
    }

    public double getChorizo() {
        return chorizo;
    }

}
