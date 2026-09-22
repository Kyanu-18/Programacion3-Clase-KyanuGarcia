public class App {
    public static void main(String[] args) throws Exception {

        Vehiculo[] vehiculos = new Vehiculo[5];
 
        vehiculos[0] = new Automovil("A001", "Toyota", "Corolla", 2022, 4);
        vehiculos[1] = new Motocicleta("M001", "Kawasaki", "NinjaH2", 2021, 500);
        vehiculos[2] = new Camion("C001", "Volvo", "FH16", 2020, 10000);
        vehiculos[3] = new Automovil("A002", "Nissan", "GTR", 2023, 2);
        vehiculos[4] = new Camion("C002", "Mack", "R450", 2019, 15000);
 
        System.out.println("INFORMACION DE LOS VEHICULOS\n");
 
        for (Vehiculo v : vehiculos) {

            System.out.println(v);
 
            System.out.println("Tipo real: " + v.getClass().getSimpleName());
 
            v.conducir();
 
            if (v instanceof Cargable) {
                System.out.println(v.getClass().getSimpleName() + " puede cargar y descargar carga (implementa Cargable).");
            }
 
            System.out.println("-----------------------------------------");
        }
 
        System.out.println("\n OPERACION DE CARGA Y DESCARGA ");
        Camion miCamion = (Camion) vehiculos[2];
        miCamion.cargar(5000);
        miCamion.cargar(6000);
        miCamion.descargar();
    }
}