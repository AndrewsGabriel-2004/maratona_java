package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.dominio.SystemBankGPT;

public class SystemBankTestGPT {
    public static void main(String[] args) {
        SystemBankGPT account = new SystemBankGPT();

        account.depositAccount(5000);
        account.depositAccount(5000);
        account.draw(12500);

        account.setCostumer("Andrews Gabriel Pontes de Oliveira");
        account.setAcountNumber(562322);

        account.showDetails();
    }
}
