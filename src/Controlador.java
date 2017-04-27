/**
 * Created by hoffsilva on 27/04/17.
 */
public class Controlador {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Joaquim José de Alcântara Xavier");
        Banco banco = new Banco("Banco do Brasil", "001");
        Agencia agencia = new Agencia(banco,"1003");

        Conta conta = new Conta(cliente, agencia, 10000.00);
        conta.depositar(1000.00);
        conta.sacar(300.00);

        System.out.println("O saldo da conta é R$ " + conta.getSaldo());
    }
}
