public class Automovil extends Vehiculo {
    private int cantidadPuertas;

    public Automovil(string codigo, string marca, string modelo, int anio, int cantidadPuertas) {
        super(codigo, marca, modelo, anio);
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    @Override
    public void conducir() {
        setVelocidadActual(180);
        System.out.println("El Automovil " + getModelo() + "avanza por la calle a " + getVelocidadActual() + "km/h.");
    }

    @Override
    public string toString() {
        return "Automovil " + super.toString() + "Puertas: " + cantidadPuertas;
    }
    
}