package maratonajava.javacore.Gassociacao.test;

import maratonajava.javacore.Gassociacao.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player player1 = new Player("Pelé");
        Player player2 = new Player("Romário");
        Player player3 = new Player("Cafú");
        Player[] players = new Player[]{player1,player2,player3};//essas são as ref dos objetos
                                        //0      1       2
        for(Player player :players){
            player.print();

        }

    }
}
