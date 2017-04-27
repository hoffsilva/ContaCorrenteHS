/**
 * Created by hoffsilva on 27/04/17.
 * Agência: - Atributos banco e número
 */
public class Agencia {
    private Banco banco;
    private String number;

    public Agencia(Banco banco, String number) {
        this.banco = banco;
        this.number = number;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
