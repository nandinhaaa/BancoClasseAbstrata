package View;
import herancaDP.*;
import herancaDP.ContaPoupanca;

public class TestaDeposita {

    public static void main(String[] args) {
        Conta cp = new ContaPoupanca();
        try {
            cp.deposita(-100);
            System.out.println("Depósito realizado com sucesso!");
        } catch (ValorInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
