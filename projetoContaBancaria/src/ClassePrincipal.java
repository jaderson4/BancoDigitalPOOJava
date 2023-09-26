import model.ContaCorrente;
import model.ContaPoupança;
import ultils.DataUtil;

public class ClassePrincipal {

    public static void main(String[] args) {
        System.out.println("criando um banco digital!");
        System.out.println();

        ContaCorrente conta = new ContaCorrente("0001","6969",5,100);
        System.out.println("saldo atual de R$:" + conta.getSaldo());
        System.out.println();

        conta.depositar(550);
        System.out.println("saldo atual de R$:" + conta.getSaldo());
        System.out.println();


        var saque = conta.sacar(150);
        System.out.println("saldo atual de R$:" + conta.getSaldo());

        ContaPoupança conta2 = new ContaPoupança("0001","9666",4,100);
        System.out.println("saldo atual conta2 de R$:" + conta2.getSaldo());
        System.out.println();
        conta2.transferir(50,conta);
        System.out.println("saldo atual conta2 de R$:" + conta2.getSaldo());
        System.out.println();
        System.out.println("saldo atual de R$:" + conta.getSaldo());
        System.out.println();


        var f1 = DataUtil.converterDateParaDate(conta2.getDataAbertura());
        var f2 = DataUtil.converterDateParaHora(conta2.getDataAbertura());
        var f3 = DataUtil.converterDateParaDateEHora(conta2.getDataAbertura());

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

       // Movimentaçao movimentaçao = new Movimentaçao("saque",100);
       // System.out.println(movimentaçao);

        conta.imprimiExtrato();
        conta2.imprimiExtrato();



    }
}
