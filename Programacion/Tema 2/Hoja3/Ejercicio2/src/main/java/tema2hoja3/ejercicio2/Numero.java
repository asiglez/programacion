/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2hoja3.ejercicio2;

/**
 *
 * @author Asier
 */
public class Numero {
    public int num;

    public Numero() {
        num = 0;
    }

    public Numero(int num) {
        this.num = num;
    }

    public void suma(int num2) {
        num += num2;
    }

    public void resta(int num2) {
        num -= num2;
    }

    public int getNum() {
        return num;
    }

    public void doble() {
        this.num = num * 2;
    }

    public void triple() {
        this.num = num * 3;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
