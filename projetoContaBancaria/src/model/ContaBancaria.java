package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;

public abstract class ContaBancaria {


    //<editor-fold desc="ATRIBUTOS">


    protected String conta;
    protected String agencia;
    protected Integer digito;
    protected double saldo;
    protected double VALOR_MIN_DEPOSITO = 10;
    protected Date dataAbertura;

     ArrayList<Movimentaçao> movimentaçoes;
    //</editor-fold>





    //<editor-fold desc="GETS and SETS">
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Integer getDigito() {
        return digito;
    }

    public void setDigito(Integer digito) {
        this.digito = digito;
    }

    public double getSaldo() {
        return saldo;
    }
    public Date getDataAbertura() {
        return dataAbertura;
    }

    //</editor-fold>




    //<editor-fold desc="CONSTRUTOR">
    public ContaBancaria(String agencia, String conta, Integer digito, double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
        this.dataAbertura = new Date();
        this.movimentaçoes = new ArrayList<Movimentaçao>();

    Movimentaçao movimentaçao = new Movimentaçao("abertura de conta",saldoInicial);
    this.movimentaçoes.add(movimentaçao);

    }
    //</editor-fold>

    //<editor-fold desc="METODOS">
    public void depositar(double valor){
        //verifica se o valor de deposito é menor que o valor minimo
        //se for não acontece deposito
        if(valor < VALOR_MIN_DEPOSITO){
            throw new InputMismatchException("o valor minimo de deposito é R$:" + VALOR_MIN_DEPOSITO);

        }
        //efetua o deposito somando valor ao saldo
        this.saldo += valor;
        Movimentaçao movimentaçao = new Movimentaçao("Deposito",valor);
        this.movimentaçoes.add(movimentaçao);

    }
    public double sacar(double valor){
        //verifica se o valor é maior que saldo da conta
        //se for manda mensagem de saldo insuficienete
       if (valor > this.saldo){
           throw new InputMismatchException("o saldo é insuficiente R$:" + saldo);
       }
       //aqui remove o valor de saque do saldo atual
        this.saldo -= valor;
        Movimentaçao movimentaçao = new Movimentaçao("retirada de valor",valor);
        this.movimentaçoes.add(movimentaçao);
       //retorna o valor sacado ao usuario
       return valor;

    }

    public void transferir( double valor, ContaBancaria contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);


    }

    public abstract void  imprimiExtrato();

    //</editor-fold>

}
