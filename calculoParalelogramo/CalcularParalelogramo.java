package calculoParalelogramo;

import java.util.Scanner;
import calculoParalelogramo.Paralelogramo;

public class CalcularParalelogramo {
    private static final Scanner ENTRADA = new Scanner(System.in);

    public static void main(String[] args) {
         Paralelogramo paralelogramo;
         paralelogramo = new Paralelogramo(ENTRADA.nextInt(), ENTRADA.nextInt(), ENTRADA.nextInt());
         System.out.println(String.format("A area do paralelogramo e: %.2f", paralelogramo.calcularArea()));
         System.out.println(String.format("O perimetro do paralelogramo e: %.2f", paralelogramo.calcularPerimetro()));
         System.out.println(String.format("O angulo maior do paralelogramo e: %.2f", paralelogramo.maiorAngulo()));
    }
}
