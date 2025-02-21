package maratonajava.introducao.aula06;

public class Aula06RepetitionStructures03 {
    public static void main(String[] args) {

        int maxValue = 50;

        for(int i = 0; i <=maxValue; i++){
            if(i <=25){
                System.out.println(i);
            }
            System.out.println("i: "+i);
            //waste of processment
        }

        for(int i = 0; i <=maxValue; i++) {
            if (i > 25) {
                break;                      //<-----BEST
            }
            System.out.println(i);
        }
    }
}
