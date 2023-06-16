/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2hoja8.ejercicio1;

/**
 *
 * @author Asier
 */
public class Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;

    public Persona(String nombre, String apellido1, String apellido2, String dni) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
    }
    public String clave(){
        return nombre.substring(0,1)+apellido1.substring(0,3)+apellido2.substring(apellido2.length() - 1);
    }
    public boolean dniValido(){
        boolean valido;
        String letrasPosibles="TRWAGMYFPDXBNJZSQVHLCKE";
        int numerosDni = Integer.parseInt(dni.substring(0,8));
        int posicionLetraDni = numerosDni%23;
        String letraDniCalculado = letrasPosibles.substring(posicionLetraDni,posicionLetraDni+1);
        if(dni.length()==9 ){
            valido=letraDniCalculado.equalsIgnoreCase(dni.substring(8,9));;
        }else{
            valido=false;
        }
        return valido;
    }
}
