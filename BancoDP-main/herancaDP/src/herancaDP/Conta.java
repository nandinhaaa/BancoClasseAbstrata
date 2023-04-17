package herancaDP;

public class Conta {
    private double saldo;

    public void deposita(double valor) throws ValorInvalidoException {
        if (valor < 0) {
            throw new ValorInvalidoException(valor);
        } else {
            this.saldo += valor;
        }
    }

    public void atualiza(double taxa) throws ValorInvalidoException {
        this.saldo += this.saldo * taxa;
    }

    public double getSaldo() {
        return this.saldo;
    }
}