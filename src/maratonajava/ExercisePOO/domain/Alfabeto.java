package maratonajava.ExercisePOO.domain;

public class Alfabeto {
    private int number;
    private char[] alfa;

    //constructor
    public Alfabeto(char[] alfa, int number){
        this.number = number;
        this.alfa = alfa;
    }

    public void sistChoose(int number){

        if(number > 26){
            System.out.println("Opção Inválida");
            return;
        }

      for (int i = 0; i <number;i++){
          System.out.print(alfa[i]+ " ");
      }

    }
}
