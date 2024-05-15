package br.edu.cesarschool.cc.poo.meiotransporte.motorizado;

import br.edu.cesarschool.cc.poo.meiotransporte.MeioTransporte;

public class MeioTransporteMotorizado extends MeioTransporte {
    private double potenciaMotor;
    private double capacidadeCombustivel;
    private double consumoMedio;

    public MeioTransporteMotorizado(double velocidadeMaxima, double cargaMaxima, String nome, double consumoMedio, double potenciaMotor, double capacidadeCombustivel) {
        super(velocidadeMaxima, cargaMaxima, nome);
        this.consumoMedio = consumoMedio;
        this.potenciaMotor = potenciaMotor;
        this.capacidadeCombustivel = capacidadeCombustivel;
    }

    public double getPotenciaMotor() {
        return potenciaMotor;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public double getCapacidadeCombustivel() {
        return capacidadeCombustivel;
    }

    public void setPotenciaMotor(double potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public void setCapacidadeCombustivel(double capacidadeCombustivel) {
        this.capacidadeCombustivel = capacidadeCombustivel;
    }

    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    protected double calcularAutonomia(){
        return this.capacidadeCombustivel * this.consumoMedio;
    }
}
