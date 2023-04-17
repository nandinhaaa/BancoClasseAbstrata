package herancaDP;

public class AtualizadorContas {

	private double saldoTotal = 0;
	private double selic;

	public AtualizadorContas(double selic) {
		this.selic = selic;
	}

	public void roda(Conta c) throws ValorInvalidoException {
		System.out.println("\nSaldo anterior: " + c.getSaldo());
		c.atualiza(selic);
		System.out.println("Saldo final: " + c.getSaldo());
		saldoTotal += c.getSaldo();
	}

	public double getSaldoTotal() {
		return saldoTotal;
	}
}
