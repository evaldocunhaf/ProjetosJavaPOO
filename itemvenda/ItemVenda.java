package itemvenda;

import itemvenda.Produto;
import itemvenda.TipoPagamento;

public class ItemVenda {
    private Produto produto;
    private TipoPagamento pagamento;
    private int quantidade;
    private double aliquotaImposto;
    private boolean isentoImposto;

    public ItemVenda(Produto produto, TipoPagamento pagamento, int quantidade, double aliquotaImposto, boolean isentoImposto) {
        this.produto = produto;
        this.pagamento = pagamento;
        this.quantidade = quantidade;
        this.aliquotaImposto = aliquotaImposto;
        this.isentoImposto = isentoImposto;
    }

    public double calcularImposto(){
        if(this.isentoImposto){
            return 0;
        }else{
            double porcentagem = this.aliquotaImposto / 100;
            return porcentagem * this.produto.preco * this.quantidade;
        }
    }

    public double calcularValorTotal(){
        double imposto = calcularImposto();
        return imposto + (this.produto.preco * this.quantidade);
    }

    public double calcularLucro(double custoRateado){
        double valorTotal = calcularValorTotal();
        double imposto = calcularImposto();
        return  valorTotal - imposto - custoRateado - this.pagamento.tarifa;
    }
}
