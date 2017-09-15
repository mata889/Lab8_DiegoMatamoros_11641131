
public class hamadriades extends hadas{

    

    public hamadriades(String nombre, String edad, double altura) {
        super(nombre, edad, altura);
        this.setTipo(tipo);
        this.setPoder(poder);
        this.setSalud(salud);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = "Hamadriades";
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = 546.0;
    }

    public double getPoder() {
        return poder;
    }

    public void setPoder(double poder) {
        this.poder = 78.0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
  
}
