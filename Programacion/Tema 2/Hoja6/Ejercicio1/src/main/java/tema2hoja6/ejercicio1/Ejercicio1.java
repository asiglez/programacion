/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema2hoja6.ejercicio1;

/**
 *
 * @author Asier
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Taller t1 = new Taller(10, 40);
        Taller t2 = new Taller(t1);
        t1.addAceite(1);
        t1.addRuedas(4);
        System.out.println("Se pueden hacer "+t1.getCambioCompletos()+ " cambios completos");
        System.out.println("Se pueden hacer "+t1.getCambioParcial()+ " cambios parciales");
        t1.cambioCompleto();
        t1.cambioParcial();
        System.out.println("Hay "+t1.getRuedas()+" ruedas");
        System.out.println("Hay "+t1.getAceite()+" litros de aceite");
        System.out.println(t1.toString());
        //Probamos con el contructor copia
        t2.addAceite(1);
        t2.addRuedas(4);
        System.out.println("Se pueden hacer "+t2.getCambioCompletos()+ " cambios completos");
        System.out.println("Se pueden hacer "+t2.getCambioParcial()+ " cambios parciales");
        t2.cambioCompleto();
        t2.cambioParcial();
        System.out.println("Hay "+t2.getRuedas()+" ruedas");
        System.out.println("Hay "+t2.getAceite()+" litros de aceite");
        System.out.println(t2.toString());
    }
}
