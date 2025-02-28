package maratonajava.javacore.Gassociacao.domain;

public class Team {
    private String name;
    private Player[] players;

    //constructors
    public Team(String name) {            //team
        this.name = name;

    }

    public Team(String name, Player[] players) {    //players
        this.name = name;
        this.players = players;
    }

    public void print(){
        if(players == null){
            return;
        }
        for (Player player : players) {
            System.out.println(player.getName());
        }
    }

    //getter
    public String getName() {
        return name;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }
}
