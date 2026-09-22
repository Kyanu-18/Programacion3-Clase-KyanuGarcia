public class Cajero extends Thread {
    CuentaBancaria cuenta;

    String[] nombres = {"Ana", "Luis", "Carlos", "Kyanu", "Maria"};
    double[] montos = {1500.00, -200.00, 800.00, 500.00, 3000.00};

    public Cajero(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                cuenta.depositar(nombres[i], montos[i]);
            } catch (DepositoInvalidoException e) {
                System.out.println("[Cajero]  ERROR        | " + nombres[i] + " | " + e.getMessage());
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}