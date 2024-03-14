package figurasgeometricas;

import figurasgeometricas.Endereco;

public class Terreno {
    protected double area;
    private double valorPorMetroQuadrado;
    private Endereco endereco;

    public Terreno(double valorPorMetroQuadrado, Endereco endereco) {
        this.valorPorMetroQuadrado = valorPorMetroQuadrado;
        this.endereco = endereco;
    }

    public double calcularValorTerreno(){
        return this.area * this.valorPorMetroQuadrado;
    }
}
