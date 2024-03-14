package ficha1;

import java.util.Scanner;

public class JavaEstruturado3 {
    private static final Scanner ENTRADA = new Scanner(System.in);

    public static void main(String[] args) {
        double input;
        double resultadoSoma=0;
        double resultadoMulti=1;
        double mediaAritmetrica;
        double mediaGeometrica;
        double mediaHarmonica;

        for(int i=0; i < 5; i++){
            input = ENTRADA.nextInt();

            resultadoMulti = resultadoMulti * input;
            resultadoSoma = resultadoSoma + input;
        }

        mediaAritmetrica = resultadoSoma / 5;
        mediaGeometrica = Math.pow(resultadoMulti, (1.0/5));
        mediaHarmonica = 1 / resultadoSoma;

        System.out.println(mediaAritmetrica);
        System.out.println(mediaGeometrica);
        System.out.println(mediaHarmonica);
    }
}
