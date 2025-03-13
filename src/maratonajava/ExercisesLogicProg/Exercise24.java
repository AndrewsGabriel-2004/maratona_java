package maratonajava.ExercisesLogicProg;

import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tempo da viagem (em horas):");
        double horas = input.nextDouble();
        System.out.println("Velocidade média:");
        double vm = input.nextDouble();

        double distancia = horas * vm;
        double consumo = distancia / 12;

        System.out.println("Distancia percorrida: "+ distancia +" Km");
        System.out.println("Consumo: "+ consumo +" Litros");

    }
}
