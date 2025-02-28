package maratonajava.javacore.Gassociacao.domain;

public class Player {
    private String name;
    private Team team; //pode cadastrar, mas dps tem q escolher um time. Se colocasse no construtor ele era obrigado a ter um time


    //constructor
    public Player(String name) {
        this.name = name; //eu tenho certeza q o objeto foi criado pois eu passei o parametro para ele

    }

    public void print(){
        if(team == null){
            return;
        }
        System.out.println(team.getName());
    }

    //get
    public String getName() {
        return name;
    }

    public Team getTeam() {
        return team;
    }

    //set
    public void setName(String name) {
        this.name = name;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
