package constructor;



/**
 *
 * @author Alumno
 */
public abstract class Persona {
    String nacionalidad = "";
    String nombre = "";
    
    public abstract void hablar();
    
    Persona(String nacionalidad, String nombre){
        this.nacionalidad = nacionalidad;
        this.nombre = nombre;
    }
}