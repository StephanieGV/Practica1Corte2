package constructor;

/**
 *
 * @author Alumno
 */
public abstract class Coche {
    int color = 0;
    int gasolina = 0;
    
    public abstract void acelerar();
    public abstract void frenar();
    public abstract void arrancar();
    
    Coche(int color, int gasolina){
        this.color = color;
        this.gasolina = gasolina;
    }
}