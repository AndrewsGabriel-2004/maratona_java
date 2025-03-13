package maratonajava.ExercisesLogicProg;

// 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
//     2 - À Vista no cartão de crédito, recebe 10% de desconto
//     3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
//     4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        double value = sc.nextDouble();

        System.out.print("Qual for de pagamento você escolhe(1 a 4)? ");
        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("À Vista em Dinheiro ou Pix, recebe 15% de desconto");
                double newValue = value * 0.85;
                String result = String.format("%.2f",newValue);
                System.out.println("Valor a pagar: "+ result);
                break;
            case 2:
                System.out.println("À Vista no cartão de crédito, recebe 10% de desconto");
                newValue = value * 0.9;
                result = String.format("%.2f",newValue);
                System.out.println("Valor a pagar: "+ result);
                break;
            case 3:
                System.out.println("Parcelado no cartão em duas vezes, preço normal do produto sem juros");
                newValue = value;
                result = String.format("%.2f",newValue);
                System.out.println("Valor a pagar: "+ result);
                break;
            case 4:
                System.out.println("Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
                newValue = value * 1.1;
                result = String.format("%.2f",newValue);
                System.out.println("Valor a pagar: "+ result);
                break;
        }


    }
}
