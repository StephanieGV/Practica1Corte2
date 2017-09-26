/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author Alumno
 */
public abstract class Agenda {
    public int numeros_T;
    public String nombres;
    
    public abstract void citas();
    
    Agenda(int numero, String Nombre){
        this.nombres = Nombre;
        this.numeros_T = numero;
    }
            
}
