/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5hoja10.ejercicio1;

/**
 *
 * @author Asier
 */
public class Troyano extends Guerrero{
    public Troyano(String newnombre, int newedad, int newfuerza){
        super(newnombre,newedad,newfuerza);
    }
    
    public Troyano(){
        super();
    }
    
    @Override
    public boolean retirarse() {
        return false;
    }
}
