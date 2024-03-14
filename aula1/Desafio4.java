package aula1;

import java.util.Scanner;

public class Desafio4 {
    private static final Scanner ENTRADA = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = -1;
        double numero = 0, resposta = 0;
        boolean repeticao = true;
        while(repeticao) {
            opcao = ENTRADA.nextInt();
            if (opcao >= 1 && opcao < 4) {
                repeticao = false;
            }
        }

        numero = ENTRADA.nextDouble();

        if(opcao == 1){
            resposta = numero % 2;

        } else if (opcao == 2) {
            resposta = numero + Math.PI;

        } else{
            resposta = 1 / numero;

        }
        String saida = String.format("a resposta do numero %.2f na opcao %d é: %.4f", numero, opcao, resposta);
        System.out.println(saida);

    }
}
