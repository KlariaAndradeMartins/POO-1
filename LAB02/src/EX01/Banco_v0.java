package EX01;

public class Banco_v0 {
    public static void main(String[] args) {

        Conta_v0 c1 = new Conta_v0();

        c1.setSaldo(10000);
        c1.setLimite(10000);

        double saldoAtual = c1.getSaldo();
        double limiteAtual = c1.getLimite();

        System.out.println("Saldo Atual: " + saldoAtual);
        System.out.println("Limite Atual: " + limiteAtual);
    }
}
