package figurasgeometricas;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double obterDiametro(){
        return this.raio * 2;
    }

    public double calcularArea(){
        return Math.PI * Math.pow(this.raio, 2);
    }

    public double calcularPerimetro(){
        return 2*Math.PI*this.raio;
    }

    public double calcularComprimentoArco(double anguloArco){return anguloArco * Math.PI * this.raio /180;}



}
