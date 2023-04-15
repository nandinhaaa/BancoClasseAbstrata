package View;

import herancaDP.*;

public class TestaGerenciadorDeImpostoDeRenda {
	public static void main(String[] args) {
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();

		SeguroDeVida sv = new SeguroDeVida();
		gerenciador.adiciona(sv);

		ContaCorrente cc = new ContaCorrente();
		cc.deposita(10);
		gerenciador.adiciona(cc);

		System.out.printf("Total de impostos: R$ %.2f", gerenciador.getTotal());

	}
}
