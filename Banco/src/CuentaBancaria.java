public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(String titular) {
        saldo = 0;
    }

    public synchronized void depositar(String cliente, double monto) throws DepositoInvalidoException {
        if (monto <= 0) {
            throw new DepositoInvalidoException("Monto invalido: " + monto);
        }
        if (cliente == null || cliente.equals("")) {
            throw new DepositoInvalidoException("Cliente sin nombre");
        }

        saldo = saldo + monto;
        System.out.printf("[Cajero]  Deposito OK  | %s | $%.2f | Saldo: $%.2f%n", cliente, monto, saldo);
    }

    public synchronized double getSaldo() {
        return saldo;
    }
}