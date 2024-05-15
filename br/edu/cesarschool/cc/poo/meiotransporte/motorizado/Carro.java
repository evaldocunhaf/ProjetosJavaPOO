package br.edu.cesarschool.cc.poo.meiotransporte.motorizado;

class Carro extends MeioTransporteMotorizado{
    Carro(double velocidadeMaxima, double cargaMaxima, String nome, double consumoMedio, double potenciaMotor, double capacidadeCombustivel) {
        super(velocidadeMaxima, cargaMaxima, nome, consumoMedio, potenciaMotor, capacidadeCombustivel);
    }
    public double calcularEficiencia(){
        return getCargaMaxima() / getConsumoMedio();
    }

}
