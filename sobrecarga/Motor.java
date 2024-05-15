package sobrecarga;

public class Motor {
    private long codigo;
    private String nome;
    private double potencia;
    private double vazao;

    public Motor() {
    }

    public Motor(long codigo, String nome) {
        this();
        this.codigo = codigo;
        this.nome = nome;
    }

    public Motor(long codigo, String nome, double potencia, double vazao) {
        this(codigo, nome);
        this.potencia = potencia;
        this.vazao = vazao;
    }

    public double getVazao() {
        return vazao;
    }

    public void setVazao(double vazao) {
        this.vazao = vazao;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }
}
