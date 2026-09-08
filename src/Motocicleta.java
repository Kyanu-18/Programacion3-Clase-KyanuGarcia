public class Motocicleta extends Vehiculo {
    private int cilindrada;

    public Motocicleta(string codigo, string marca, string modelo, int anio, int cilindrada) {
        super(codigo, marca, modelo, anio);
        this.cilindrada = cilindrada;
    }

    public int cilindrada() {
        return cilindrada;
    }

    @Override
    public void conducir() {
        setVelocidadActual(100);
        System.out.println("La motocicleta " + getModelo() + "avanza por la calle a " + getVelocidadActual() + "km/h.");
    }

    @Override
    public string toString() {
        return "Motocicleta " + super.toString() + "Cilindrada: " + cilindrada;
    }
    
}