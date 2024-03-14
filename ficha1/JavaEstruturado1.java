package ficha1;

import java.util.Scanner;

public class JavaEstruturado1 {
    private static final Scanner ENTRADA = new Scanner(System.in);
    public static void main(String[] args) {
        int input;
        int resultado = 1;

        input = ENTRADA.nextInt();

        if(input < 0){
            System.out.println("MENOR QUE ZERO");
        }else if(input > 16){
            System.out.println("OVERFLOW");
        }else{
            for(int i = 1; i < input+1; i++){
                resultado = resultado * i;
            }
            System.out.println(resultado);
        }
    }
}
