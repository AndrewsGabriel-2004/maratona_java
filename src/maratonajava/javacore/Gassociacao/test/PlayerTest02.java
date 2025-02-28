package maratonajava.javacore.Gassociacao.test;

import maratonajava.javacore.Gassociacao.domain.Player;
import maratonajava.javacore.Gassociacao.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player1 = new Player("Pelé");
        Player player2 = new Player("Zico");
        Team team = new Team("Flamengo");

        player1.setTeam(team); //cadastrado no time
        player2.setTeam(team);

        player2.print();

    }
}
