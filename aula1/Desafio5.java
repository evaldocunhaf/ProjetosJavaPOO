package aula1;

import java.util.Scanner;

public class Desafio5 {
    private static final Scanner ENTRADA = new Scanner(System.in);

    public static void main(String[] args) {
        double numero;
        do{
            numero = ENTRADA.nextInt();
            if(numero<2 || numero>20){
                System.out.println(numero);
            }
        }while(numero != 1);
    }
}
