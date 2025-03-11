package maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculator {
    public int addTwoNumbers(int number21,int number22) {
        return 10 + 10;
    }
    public void lessTwoNumbers() {
        System.out.println(21-2);
    }
    public void multiplyTwoNumbers(int num1,int num2, int num3) {
        System.out.println(num1 * num2); //parâmetro
    }


   //Agora é com return


    public int partTwoNumbers(double num1, double num2){ //double é oq retorna
        if(num2 == 0){
            return 0;
        }
        return (int)(num1/num2);
    }
    public void printPartTwoNumbers02 (double num1, double num2){
        if(num2 == 0){
            System.out.println("Don't exist division by 0");
            return;
        }
            System.out.println(num1/num2);
    }

    public void transformTwoNumbers(int num1, int num2){

        num1 = 99;
        num2 = 33;

        System.out.println("Inside transformTwoNumbers");
        System.out.println("num1: "+ num1);
        System.out.println("num2: "+ num2);
    }

        public void additionArray(int[] numbers){
        int soma = 0;

        for(int i=0; i <= numbers.length; i++){
            soma += i;
        }

        System.out.println(soma);

    }

    public void additionVarArgs(int...numbers){

        int soma = 0;

        for(int i=0; i <= numbers.length; i++){
            soma += i;
        }

        System.out.println(soma);

    }
}
