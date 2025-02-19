package maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {

        int age = 14;

        if (age >= 18) {

            System.out.println("Pode botar para dentro mermão");
        }
        else {
            System.out.println("Vira homem e dps vc bebe!");
        }


        boolean isAuthorizedtoBuyAlcoholicThings = age >= 18;
        if (isAuthorizedtoBuyAlcoholicThings) {
            System.out.println("Pode botar para dentro mermão");
        }
        if(!isAuthorizedtoBuyAlcoholicThings) {
            System.out.println("Vira homem e dps vc bebe!");
        }


    }
}
