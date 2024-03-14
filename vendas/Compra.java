package vendas;

import java.util.Scanner;
import vendas.ItemVenda;
import vendas.Produto;
public class Compra {
    private static final Scanner ENTRADA = new Scanner(System.in);

    public static void main(String[] args) {
        Produto produto;
        ItemVenda venda;

        produto = new Produto(ENTRADA.nextLong(), ENTRADA.nextLine(), ENTRADA.nextDouble());
        venda = new ItemVenda(produto, ENTRADA.nextInt(), ENTRADA.nextDouble(), ENTRADA.nextBoolean());

        System.out.println(String.format("O valor do imposto e: %.2f", venda.calcularImposto()));
        System.out.println(String.format("O preco total da venda foi: %.2f", venda.calcularValorTotal()));
    }
}
