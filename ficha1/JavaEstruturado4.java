package ficha1;

import java.util.Scanner;

public class JavaEstruturado4 {
    private static final Scanner ENTRADA = new Scanner(System.in);

    public static void main(String[] args) {
        int escolha;
        double primeironumero;
        double segundonumero;
        double resposta = 0;

        escolha = ENTRADA.nextInt();
        if(escolha < 1 && escolha > 4){
            System.out.println("OPC ERRADA");
        }else{
            primeironumero = ENTRADA.nextDouble();
            segundonumero = ENTRADA.nextDouble();

            if(escolha == 4 && segundonumero == 0){
                System.out.println("DIV ZERO");
            }else{
                resposta = switch (escolha){
                case 1 -> primeironumero + segundonumero;
                case 2 -> primeironumero - segundonumero;
                case 3 -> primeironumero * segundonumero;
                case 4 -> primeironumero / segundonumero;
                default -> resposta;

            };
                System.out.println(resposta);
            }
        }
    }
}
