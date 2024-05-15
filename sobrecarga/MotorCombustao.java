package sobrecarga;

public class MotorCombustao extends Motor {
    private double consumoMedio;
    public MotorCombustao() {
        super();
    }

    public MotorCombustao(String nome, long codigo, double consumoMedio, double potencia, double vazao) {
        super(codigo, nome, potencia, vazao);
        this.consumoMedio = consumoMedio;
    }

    public MotorCombustao(String nome, long codigo, double consumoMedio) {
        this(nome, codigo, consumoMedio, 0, 0);
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }
}
