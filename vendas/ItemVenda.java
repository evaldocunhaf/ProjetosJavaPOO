package vendas;

import vendas.Produto;

public class ItemVenda {
    private Produto produto;
    private int quantidade;
    private double aliquotaDeImposto;
    private boolean isentoImposto;

    public ItemVenda(Produto produto, int quantidade, double aliquotaDeImposto, boolean isentoImposto){
        this.produto = produto;
        this.quantidade = quantidade;
        this.aliquotaDeImposto = aliquotaDeImposto;
        this.isentoImposto = isentoImposto;
    }

    public double calcularImposto(){
        if(this.isentoImposto){
            return(0);
        }else{
            return ((this.aliquotaDeImposto / 100) * (this.quantidade * this.produto.preco));
        }
    }

    public double calcularValorTotal(){
        double imposto = this.calcularImposto();

        return (imposto + (this.produto.preco * this.quantidade));
    }

}
