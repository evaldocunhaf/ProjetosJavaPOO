package ficha1;

import java.util.Scanner;

public class JavaEstruturado2 {
    private static final Scanner ENTRADA = new Scanner(System.in);
    public static void main(String[] args) {
        double input;
        double resultado = 0;
        while(true){
            input = ENTRADA.nextInt();
            if(input < 0){
                break;
            }else{
                if(input > 5 && input < 5000){
                    resultado = resultado + input;
                }
                System.out.println(resultado);
            }
        }
    }
}
