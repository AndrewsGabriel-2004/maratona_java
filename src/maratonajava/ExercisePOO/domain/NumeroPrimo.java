package maratonajava.ExercisePOO.domain;

public class NumeroPrimo {

    public static void validationNumber(int number) {
        boolean validacaoNumero = true;
        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                validacaoNumero = false;
                System.out.println("A afirmação que o número " + number + " é primo é " + validacaoNumero);
                break;
            }
        }
        if(validacaoNumero){
            System.out.println("A afirmação que o número " + number + " é primo é " + validacaoNumero);
        }
    }
}