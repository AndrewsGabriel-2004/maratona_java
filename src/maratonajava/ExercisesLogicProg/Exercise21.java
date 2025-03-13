package maratonajava.ExercisesLogicProg;

import java.util.Random;

public class Exercise21 {
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("Número sorteado: " + rand.nextInt(100));
        // OUUUU

        int contador = 0;
        for(int i = 0; i < System.nanoTime()%1000;i++){
            contador = (contador + 3) % 101;

        }
        System.out.println("Número sorteado: "+ contador);

    }
}
