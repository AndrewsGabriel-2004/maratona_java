package maratonajava.introducao.aula05;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {

    //age < 15 infantil
    //age >=15 && < 18 juvenil
    //age >= 18 adulto

    int age = 15;
    String category;

    if (age < 15) {
        category ="Infant Category";
    }
    else if ((age >= 15) && (age < 18)) {
        category = "Youthful Category";
    }
    else {
        category = "Adult Category";
    }

        System.out.println(category);

    }
}
