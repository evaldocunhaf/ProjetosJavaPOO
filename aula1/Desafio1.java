package aula1;

import java.util.Scanner;

public class Desafio1 {
    private static final Scanner ENTRADA = new Scanner(System.in);
    public static void main(String[] args) {
        int a = ENTRADA.nextInt();
        int i;
        if(a < 0){
            System.out.println("número menor que zero");
        }else{
            for(i=0; i <= a; i++){
                if(i % 2 == 0){
                    System.out.println(i);
                }
            }
        }
    }
}