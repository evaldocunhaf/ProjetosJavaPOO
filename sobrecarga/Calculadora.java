package sobrecarga;

import java.math.BigDecimal;

public class Calculadora {

    public static double exponenciar(double base, double exponencial) {
        return Math.pow(base, exponencial);
    }
    public static double exponenciar(long base, long exponencial) {
        return exponenciar((double) base, (double) exponencial);
    }

    public static double exponenciar(BigDecimal base, BigDecimal exponencial) {
        return exponenciar(base.doubleValue(), exponencial.doubleValue());
    }
}
