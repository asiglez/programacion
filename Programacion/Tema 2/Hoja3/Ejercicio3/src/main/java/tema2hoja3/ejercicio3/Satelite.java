/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2hoja3.ejercicio3;

/**
 *
 * @author Asier
 */
public class Satelite {
    private int meridiano, paralelo, distanciaTierra;

    public Satelite() {
        meridiano = 0;
        paralelo = 0;
        distanciaTierra = 0;
    }

    public Satelite(int meridiano, int paralelo, int distanciaTierra) {
        this.meridiano = meridiano;
        this.paralelo = paralelo;
        this.distanciaTierra = distanciaTierra;
    }

    public String printPosicion() {
        String a=("Meridiano: " + meridiano
                + "\nParalelo: " + paralelo
                + "\nDistancia a la tierra: " + distanciaTierra);
        return a;
    }

    public void variarAltura(int d) {
        distanciaTierra += d;
    }

    public void variarPosicion(int meridiano, int paralelo) {
        this.meridiano = meridiano;
        this.paralelo = paralelo;
    }
    public boolean enOrbita(){
       boolean result = distanciaTierra>=16000;
        return result;
    }
}
