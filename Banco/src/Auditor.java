public class Auditor extends Thread {
    CuentaBancaria cuenta;
    boolean corriendo = true;

    public Auditor(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    public void parar() {
        corriendo = false;
    }

    public void run() {
        while (corriendo) {
            System.out.printf("[Auditor] Saldo actual : $%.2f%n", cuenta.getSaldo());
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}