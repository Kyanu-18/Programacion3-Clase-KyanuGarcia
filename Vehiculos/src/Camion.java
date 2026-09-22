class Camion extends Vehiculo implements Cargable {

    private double capacidadMaxima;
    private double cargaActual;

   public Camion(string codigo, string marca, string modelo, int anio, double capacidadMaxima) {
        super(codigo, marca, modelo, anio);
        this.capacidadMaxima = capacidadMaxima;
        this.cargaActual = 0.0;
    }
    
    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }
 
    public double getCargaActual() {
        return cargaActual;
    }
 
    @Override
    public void conducir() {
        setVelocidadActual(80);
        System.out.println("El camion " + getModelo() + " circula cargado a " + getVelocidadActual() + " km/h.");
    }
 
    @Override
    public void cargar(double peso) {
        if (cargaActual + peso <= capacidadMaxima) {
            cargaActual += peso;
            System.out.println("Se cargaron " + peso + " kg. Carga actual: " + cargaActual + " kg.");
        } else {
            System.out.println("No se puede cargar: pasa la capacidad maxima (" + capacidadMaxima + " kg).");
        }
    }
 
    @Override
    public void descargar() {
        System.out.println("Se descargaron " + cargaActual + " kg del camion.");
        cargaActual = 0.0;
    }
 
    @Override
    public String toString() {
        return "[Camion] " + super.toString() +
               "Capacidad maxima: " + capacidadMaxima + " kg" +
               "Carga actual: " + cargaActual + " kg";
    }

}