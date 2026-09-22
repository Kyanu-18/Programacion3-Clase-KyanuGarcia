public abstract class Vehiculo {

    private String codigo;
    private String marca;
    private String modelo;
    private int anio;
    private double velocidadActual

    public Vehiculo(String codigo, String marca, String modelo, int anio){
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.velocidadActual = 0.0;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual) {
        if (velocidadActual >= 0) {
            this.velocidadActual = velocidadActual;
        }
    }

    public abstract void conducir();

    @Override
    public String toString() {
        return "Codigo: " + codigo + "Marca: " + marca + "Modelo: " + modelo + "Anio: " + anio + "velocidad actual: " + velocidadActual + "km/h";

    }
}