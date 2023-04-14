
package View;

import herancaDP.*;


public class Main {

    public static void main(String[] args) {
    
    
    ContaCorrente cc = new ContaCorrente();
    ContaPoupanca cp = new ContaPoupanca();

    
    cc.deposita(1000);
    cp.deposita(1000);

    AtualizadorContas adc = new AtualizadorContas(0.10);
    
    adc.roda(cc);
    adc.roda(cp);
    System.out.println("\nSaldo Total: " + adc.getSaldoTotal());
  }
}