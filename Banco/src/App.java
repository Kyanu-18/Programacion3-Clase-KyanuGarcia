public class App {
    public static void main(String[] args) throws Exception {
        CuentaBancaria cuenta = new CuentaBancaria("Cliente Principal");

        Cajero cajero = new Cajero(cuenta);
        Auditor auditor = new Auditor(cuenta);

        cajero.start();
        auditor.start();

        cajero.join();

        auditor.parar();
        Thread.sleep(100);

        System.out.printf("Saldo final: $%.2f%n", cuenta.getSaldo());
    }
}