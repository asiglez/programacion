/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3hoja4.ejercicio7;

/**
 *
 * @author Asier
 */
public class Metodo {

    int n;

    public Metodo(int n) {
        this.n = n;
    }

    public void metodo1() {
        String numeroString = String.valueOf(n);
        System.out.println("Este numero tiene: " + numeroString.length() + " digitos");
    }

    public void metodo2() {
        for (int i = 1; i <= 10; i++) {
            int resultado = n * i;
            System.out.println(n + "*" + i + "=" + resultado);
        }
    }

    public void metodo3() {
        int suman=0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                suman+=i;
            }
        }
        if (suman==n){
            System.out.println("Es un número perfecto");
        }else{
            System.out.println("No es un número perfecto");
        }
    }

}
