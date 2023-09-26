package model;

import ultils.DataUtil;

import java.util.Date;

public class ContaCorrente extends ContaBancaria{
    //aqui herda de contabancaria
    public ContaCorrente(String agencia, String conta, Integer digito, double saldoInicial) {
        // aqui ele cria uma conta bancaria
        super(agencia, conta, digito, saldoInicial);
    }

    @Override
    public void imprimiExtrato() {
        System.out.println("-------------------------------");
        System.out.println("--------extrato bancario-------");
        System.out.println("-------------------------------");
        System.out.println();
        System.out.println("gerado em:" + DataUtil.converterDateParaDateEHora(new Date()));
        System.out.println();
        for (Movimentaçao movimentaçao : this.movimentaçoes){
            System.out.println(movimentaçao);
            System.out.println();
        }
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        }
        


    }


