/**
 * Created by hoffsilva on 27/04/17.
 * Conta: - Atributos Cliente, Agência e saldo
 *
 */
public class Conta {

    private Cliente cliente;
    private Agencia agencia;
    private Double saldo;

    public Conta(Cliente cliente, Agencia agencia, Double saldo) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void depositar(Double valor) {
        setSaldo(getSaldo() + valor);
    }

    public void sacar(Double valor) {
        setSaldo(getSaldo() - valor);
    }
}
