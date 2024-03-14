package aula1;

import java.util.Map;
import java.util.Scanner;

public class Desafio3 {

    private static final Scanner ENTRADA = new Scanner(System.in);

    public static void main(String[] args) {
        double a, b, c;
        System.out.print("Insira a: ");
        a = ENTRADA.nextDouble();
        System.out.print("Insira b: ");
        b = ENTRADA.nextDouble();
        System.out.print("Insira c: ");
        c = ENTRADA.nextDouble();

        double delta = (b*b) - (4*a*c);

        if(delta == 0){
            double raiz = b/(2*a);
            String saida = String.format("essa funcao so tem uma raiz, que é: %.2f", raiz);
            System.out.println(saida);

        } else if(delta < 0) {
           System.out.println("Os numeros passados nao formam uma equacao com raiz!");

        }else{
            double raiz1 = (-b + Math.sqrt(delta))/(2*a);
            double raiz2 = (-b - Math.sqrt(delta))/(2*a);

            String saida = String.format("as raizes sao: %.2f, %.2f", raiz1, raiz2);
            System.out.println(saida);

        }

    }
}
