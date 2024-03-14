package itemvenda;

import java.util.Scanner;

public class MainVenda {
    private static final Scanner ENTRADA = new Scanner(System.in);

    public static void main(String[] args) {
        Produto produto;
        TipoPagamento pagamento;
        ItemVenda venda;

        long codigo = ENTRADA.nextLong();
        ENTRADA.nextLine();
        String nome = ENTRADA.nextLine();
        double preco = ENTRADA.nextDouble();
        int codigoPagamento = ENTRADA.nextInt();
        ENTRADA.nextLine();
        String descricao = ENTRADA.nextLine();
        double tarifa = ENTRADA.nextDouble();
        ENTRADA.nextLine();
        FormaPagamento formaPagamento = FormaPagamento.valueOf(ENTRADA.nextLine());
        int quantidade = ENTRADA.nextInt();
        double aliquotaImposto = ENTRADA.nextDouble();
        boolean isentoImposto = ENTRADA.nextBoolean();
        double custoRateado;


        produto = new Produto(codigo, nome, preco);
        pagamento = new TipoPagamento(codigoPagamento, descricao, tarifa, formaPagamento);
        venda = new ItemVenda(produto, pagamento, quantidade, aliquotaImposto, isentoImposto);

        System.out.println(venda.calcularValorTotal());
        System.out.println(venda.calcularImposto());
        custoRateado = ENTRADA.nextDouble();
        System.out.println(venda.calcularLucro(custoRateado));
    }
}
