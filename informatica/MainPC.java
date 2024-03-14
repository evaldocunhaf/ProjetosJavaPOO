package informatica;

import java.util.Scanner;

public class MainPC {
    private static final Scanner ENTRADA = new Scanner(System.in);

    public static void main(String[] args) {
        UCP ucp;
        Modelo modelo1;
        Modelo modelo2;
        Computador computador;

        String descricaoUCP = ENTRADA.nextLine();
        String marcaUCP = ENTRADA.nextLine();
        double clockBasico = ENTRADA.nextDouble();
        double fatorTurbo = ENTRADA.nextDouble();
        ENTRADA.nextLine();
        String descricaoComputador = ENTRADA.nextLine();
        String marcaComputador = ENTRADA.nextLine();
        int capacidadeRamGB = ENTRADA.nextInt();
        int capacidadeDiscoGB = ENTRADA.nextInt();
        boolean ehNotebook = ENTRADA.nextBoolean();
        modelo1 = new Modelo(descricaoUCP, marcaUCP);
        ucp =  new UCP(clockBasico, fatorTurbo, modelo1);
        modelo2 = new Modelo(descricaoComputador, marcaComputador);
        computador = new Computador(ucp, modelo2, capacidadeRamGB, capacidadeDiscoGB, ehNotebook);
        System.out.println(ucp.calcularClockMaximo());
        System.out.println(computador.obterDescricao());
    }
}
