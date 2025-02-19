package maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {

        int salary = 70000;
        double taxes, result;
        if (salary <= 34712) {
            taxes = 0.097;
        }
        else if (salary >=34713 && salary <= 68507) {
            taxes = 0.3735;
        }
        else {
            taxes = 0.4950;
        }

        result = taxes * salary;

        System.out.println("Your taxes this year will be: " + result);
    }
}