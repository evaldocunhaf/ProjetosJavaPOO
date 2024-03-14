package aula1;

import java.util.Scanner;

public class Desafio2 {
    private static final Scanner ENTRADA = new Scanner(System.in);

    public static void main(String[] args) {
        double numero = 0;
        while(true){
            numero = ENTRADA.nextInt();
            if(numero != 1){
                break;
            }
            if(numero<2 || numero>20){
                System.out.println(numero);
            }
        }
    }
}
