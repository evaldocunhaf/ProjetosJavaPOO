package figurasgeometricas;

import java.util.Scanner;

public class MainTerreno {
    private static final Scanner ENTRADA = new Scanner(System.in);

    public static void main(String[] args) {
        int opcaoForma;
        double precoPorMetro;
        long cep;
        String logradouro;
        int numeroTerreno;
        String complemento;
        double raio;
        double base;
        double ladoAdjacente;
        double angulo;
        double l1;
        double l2;
        double l3;

        Endereco endereco;
        Circulo circulo;
        Triangulo triangulo;
        Paralelogramo paralelogramo;
        Terreno terreno;

        opcaoForma = ENTRADA.nextInt();

        switch (opcaoForma){
            case 1:
                precoPorMetro = ENTRADA.nextDouble();
                cep = ENTRADA.nextLong();
                ENTRADA.nextLine();
                logradouro = ENTRADA.nextLine();
                numeroTerreno = ENTRADA.nextInt();
                ENTRADA.nextLine();
                complemento = ENTRADA.nextLine();
                l1 =ENTRADA.nextDouble();
                l2 =ENTRADA.nextDouble();
                l3 =ENTRADA.nextDouble();
                endereco = new Endereco(cep, logradouro, numeroTerreno, complemento);
                triangulo = new Triangulo(l1, l2, l3);
                terreno = new Terreno(precoPorMetro, endereco);
                terreno.area = triangulo.calcularArea();
                System.out.println(terreno.calcularValorTerreno());
                break;
            case 2:
                precoPorMetro = ENTRADA.nextDouble();
                cep = ENTRADA.nextLong();
                ENTRADA.nextLine();
                logradouro = ENTRADA.nextLine();
                numeroTerreno = ENTRADA.nextInt();
                ENTRADA.nextLine();
                complemento = ENTRADA.nextLine();
                base = ENTRADA.nextDouble();
                ladoAdjacente = ENTRADA.nextDouble();
                angulo = ENTRADA.nextDouble();
                paralelogramo = new Paralelogramo(base, ladoAdjacente, angulo);
                endereco = new Endereco(cep, logradouro, numeroTerreno, complemento);
                terreno = new Terreno(precoPorMetro, endereco);
                terreno.area = paralelogramo.calcularArea();
                System.out.println(terreno.calcularValorTerreno());
                break;
            case 3:
                precoPorMetro = ENTRADA.nextDouble();
                cep = ENTRADA.nextLong();
                ENTRADA.nextLine();
                logradouro = ENTRADA.nextLine();
                numeroTerreno = ENTRADA.nextInt();
                ENTRADA.nextLine();
                complemento = ENTRADA.nextLine();
                raio = ENTRADA.nextDouble();
                circulo = new Circulo(raio);
                endereco = new Endereco(cep, logradouro,numeroTerreno, complemento);
                terreno = new Terreno(precoPorMetro, endereco);
                terreno.area = circulo.calcularArea();
                System.out.println(terreno.calcularValorTerreno());
                break;
            default:
                System.out.println("TIPO ERRADO");
                break;
        }
    }
}
