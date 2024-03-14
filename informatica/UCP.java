package informatica;

import informatica.Modelo;

public class UCP {
    public double clockBase;
    public double fatorTurbo;
    public Modelo modelo;

    public UCP(double clockBase, double fatorTurbo, Modelo modelo) {
        this.clockBase = clockBase;
        this.fatorTurbo = fatorTurbo;
        this.modelo = modelo;
    }

    public double calcularClockMaximo(){
        return this.clockBase * this.fatorTurbo;
    }
}
