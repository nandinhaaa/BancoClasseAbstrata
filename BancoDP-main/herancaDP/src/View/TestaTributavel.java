package View;

import herancaDP.*;

public class TestaTributavel {
	public static void main(String[] args) throws ValorInvalidoException {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.calculaTributos());
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
	}

}
