package maratonajava.javacore.Gassociacao.test;

import maratonajava.javacore.Gassociacao.domain.Player;
import maratonajava.javacore.Gassociacao.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player player1 = new Player("Cafú");
        Player player2 = new Player("Zico");
        Player[] players = {player1,player2};
        Team team = new Team("Flamengo");
        Team team1 = new Team("Corinthia");

        player1.setTeam(team1);
        player2.setTeam(team);
        team.setPlayers(players);

        System.out.println("---Players---");
        player1.print();
        player2.print();
        System.out.println("---Team---");
        team.print();


    }
}
