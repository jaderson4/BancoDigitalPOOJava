package model;

import ultils.DataUtil;

import java.util.Date;

public class Movimentaçao {
    private  String descriçao;
    private Date data;
    private double valor;

    public Movimentaçao(String descriçao, double valor) {
        this.descriçao = descriçao;
        this.data = new Date();
        this.valor = valor;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }

    public Date getData() {
        return data;
    }



    public double getValor() {
        return valor;
    }
    @Override
    public String toString(){
        String dataFormatada = DataUtil.converterDateParaDateEHora(this.getData());

        return this.getDescriçao() + "\n" + dataFormatada + "  R$:" + this.valor;




    }

}
