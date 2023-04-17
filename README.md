# BancoClasseAbstrata
### Continuação da atividade BancoHerança 
* A classe "Conta" possui um método abstrato chamado "atualiza", que é responsável por atualizar o saldo da conta.

# Inserção de Interfaces 
### Continuação da atividade BancoClasseAbstrata
* As mudanças feitas no código introduziram uma nova classe SeguroDeVida que implementa a interface Tributavel, o que permite que o seguro de vida seja adicionado ao gerenciador de imposto de renda. Além disso, foi adicionado um novo método calculaTributos() na classe SeguroDeVida que retorna o valor do tributo sobre o seguro.

# Exceções
### Continuação da atividade Inserção de Interfaces 

ValorInvalidoException: exceção lançada quando o valor passado para o método deposita de uma conta é negativo.
* Adição da classe ValorInvalidoException, que herda de Exception e é utilizada para lidar com situações onde o valor informado para uma operação é inválido.
* A classe Conta passou a lançar a exceção ValorInvalidoException no método deposita() quando o valor passado como parâmetro é menor que zero.
* A classe ContaPoupanca teve seu método atualiza() atualizado para lançar a exceção ValorInvalidoException.
