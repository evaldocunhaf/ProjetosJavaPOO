package itemvenda;
enum FormaPagamento{
    dinheiro, cartaoCredito, cartaoDebito, cheque,
    valeAlimentacaoPapel, valeAlimentacaoCartao,  pix;
}

public class TipoPagamento {
    protected int codigo;
    protected String descricao;
    protected double tarifa;
    protected FormaPagamento tipoPagamento;

    public TipoPagamento(int codigo, String descricao, double tarifa, FormaPagamento tipoPagamento) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.tarifa = tarifa;
        this.tipoPagamento = tipoPagamento;
    }
}


