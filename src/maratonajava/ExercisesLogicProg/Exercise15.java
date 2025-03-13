package maratonajava.ExercisesLogicProg;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o dia de nascimento: ");
        int dia = sc.nextInt();
        System.out.print("Digite o mês de nascimento: ");
        int mes = sc.nextInt();
        System.out.print("Digite o ano de nascimento: ");
        int ano = sc.nextInt();

        int anoAtual = 2025;
        int mesAtual = 3;
        int diaAtual = 12;

        int anoDias = (365 - ((mes-1) * 30 + dia)) + ((anoAtual - (ano+1)) * 365)+(((mesAtual-1)*30)+diaAtual);

        ano = anoDias/365;
        mes = anoDias%365/30;
        double diaNew = (anoDias%365)%30;

        System.out.println("Ano: "+ ano + " Mes: "+ mes + " Dia: "+ diaNew);
    }
}
