package constructor;

/**
 *
 * @author Alumno
 */
public abstract class Escuela {
    public int Salones;
    public String Profesores;
    public String Boleta_Alumno;
    
    public abstract void Horario();
    public abstract void Turno();
    
    Escuela(int Salones, String Profesores, String Boleta_Alumno){
        this.Salones = Salones;
        this.Profesores = Profesores;
        this.Boleta_Alumno = Boleta_Alumno;
    }
}