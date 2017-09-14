
import java.io.Serializable;


public class hadas implements Serializable {
    String nombre, edad, tipo;
    double altura, salud, poder;
    private static final long SerialVersionUID=777L;

    public hadas() {
    }

    public hadas(String nombre, String edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public hadas(String nombre, String edad, double altura, double salud, double poder) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.salud = salud;
        this.poder = poder;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public double getPoder() {
        return poder;
    }

    public void setPoder(double poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
