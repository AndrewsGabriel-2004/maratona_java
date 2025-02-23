package maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculator {
    public void addTwoNumbers() {
        System.out.println(10 + 10);
    }
    public void lessTwoNumbers() {
        System.out.println(21-2);
    }
    public void multiplyTwoNumbers(int num1,int num2, int num3) {
        System.out.println(num1 * num2); //parâmetro
    }
    public int partTwoNumbers(double num1, double num2){ //double é oq retorna
        if(num2 == 0){
            return 0;
        }
        return (int)(num1/num2);
    }
}
