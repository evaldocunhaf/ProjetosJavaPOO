package informatica;

import informatica.*;

public class Computador {
    private UCP ucp;
    private Modelo modelo;
    private int capacidadeRamEmGB;
    private int capacidadeDiscoEmGB;
    private boolean ehNotebook;

    public Computador(UCP ucp, Modelo modelo, int capacidadeRamEmGB, int capacidadeDiscoEmGB, boolean ehNotebook) {
        this.ucp = ucp;
        this.modelo = modelo;
        this.capacidadeRamEmGB = capacidadeRamEmGB;
        this.capacidadeDiscoEmGB = capacidadeDiscoEmGB;
        this.ehNotebook = ehNotebook;
    }
     public String obterDescricao(){
        String tipo;
        if(this.ehNotebook){
            tipo = "Notebook";
        }else{
            tipo = "Desktop";
        }
        return String.format("%s com processador %s, %d GB de RAM, %d GB de disco.", tipo, this.ucp.modelo.descricao, this.capacidadeRamEmGB, this.capacidadeDiscoEmGB);
     }
}
