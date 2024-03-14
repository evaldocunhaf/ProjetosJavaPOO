package calculoParalelogramo;

public class Paralelogramo {
    private double base;
    private double ladoAdjacente;
    private double angulo;

    public Paralelogramo(double base, double ladoAdjacente, double angulo){
        this.base = base;
        this.ladoAdjacente = ladoAdjacente;
        this.angulo = angulo;
    }

    public double calcularArea(){
        double h;
        h = this.ladoAdjacente * Math.sin(Math.toRadians(this.angulo));
        return(this.base * h);
    }

    public double calcularPerimetro(){
        return(this.base*2 + this.ladoAdjacente*2);
    }

    public double maiorAngulo(){
        return((360 - this.angulo*2)/2);
    }

}
