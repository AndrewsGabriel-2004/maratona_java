package maratonajava.ExercisesLogicProg;

public class Exercise19 {
    public static void main(String[] args) {
        //tabuada 1 a 10
        int[] i = new int[10];

        for (int k = 0; k < 10; k++) {
            for (int j = 1; j <= 10; j++) {
                i[k] = k+1;
                System.out.println(i[k] + " x " + j + " = " + (i[k] * j));
            }
        }
    }
}
