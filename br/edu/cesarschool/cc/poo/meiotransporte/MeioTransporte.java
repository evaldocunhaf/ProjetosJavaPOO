package br.edu.cesarschool.cc.poo.meiotransporte;

public class MeioTransporte {
    private String nome;
    private double cargaMaxima;
    private double velocidadeMaxima;

    public MeioTransporte(double velocidadeMaxima, double cargaMaxima, String nome) {
        this.velocidadeMaxima = velocidadeMaxima;
        this.cargaMaxima = cargaMaxima;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
}
