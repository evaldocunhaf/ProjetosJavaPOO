package figurasgeometricas;

public class Endereco {
    private long cep;
    private String logradouro;
    private int numero;
    private String complemento;

    public Endereco(long cep, String logradouro, int numero, String complemento) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
    }
}
