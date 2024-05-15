package br.edu.cesarschool.cc.poo.meiotransporte.naomotorizado;

import br.edu.cesarschool.cc.poo.meiotransporte.MeioTransporte;

public class MeioTransporteNaoMotorizado extends MeioTransporte {
    private TipoTracao tipoTracao;

    public MeioTransporteNaoMotorizado(double velocidadeMaxima, double cargaMaxima, String nome, TipoTracao tipoTracao) {
        super(velocidadeMaxima, cargaMaxima, nome);
        this.tipoTracao = tipoTracao;
    }

    public TipoTracao getTipoTracao() {
        return this.tipoTracao;
    }

    public void setTipoTracao(TipoTracao tipoTracao) {
        this.tipoTracao = tipoTracao;
    }
}
