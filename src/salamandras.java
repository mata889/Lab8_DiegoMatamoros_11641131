
public class salamandras extends hadas{
    double alas;

        

    public salamandras(double alas, String nombre, String edad, double altura) {
        super(nombre, edad, altura);
        this.alas = alas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = "Salamandras";
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = 683.0;
    }

    public double getPoder() {
        return poder;
    }

    public void setPoder(double poder) {
        this.poder = 71.0;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
