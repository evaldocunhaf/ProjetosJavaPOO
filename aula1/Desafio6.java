package aula1;

import java.util.Scanner;

public class Desafio6 {
    private static final Scanner ENTRADA = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = -1;
        double numero = 0, resposta = 0;
        boolean repeticao = true;
        while(repeticao) {
            opcao = ENTRADA.nextInt();
            if (opcao >= 1 && opcao < 4) {
                repeticao = false;
            }else{
                System.out.println("Resposta inválida");
            }
        }

        numero = ENTRADA.nextDouble();

        resposta = switch (opcao) {
            case 1 -> numero % 2;
            case 2 -> numero + Math.PI;
            case 3 -> 1 / numero;
            default -> resposta;
        };

        String saida = String.format("a resposta do numero %.2f na opcao %d é: %.4f", numero, opcao, resposta);
        System.out.println(saida);

    }
}

