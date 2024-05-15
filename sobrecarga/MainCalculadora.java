package sobrecarga;

import java.math.BigDecimal;

public class MainCalculadora {
    public static void main(String[] args) {
        int a1 = 12;
        byte a2 = 2;

        long b1=12;
        int b2=2;

        int c1 = 12;
        double c2 = 2.0;

        BigDecimal d1 = new BigDecimal(12);
        BigDecimal d2 = new BigDecimal(2);

        BigDecimal e1 = new BigDecimal(12);
        float e2 = 2f;


        double resultado1 = Calculadora.exponenciar(a1, a2);
        double resultado2 = Calculadora.exponenciar(b1, b2);
        double resultado3 = Calculadora.exponenciar(c1, c2);
        double resultado4 = Calculadora.exponenciar(d1, d2);
        //double resultado5 = Calculadora.exponenciar(e1,e2);



        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4);
        //System.out.println(resultado5);
    }
}
