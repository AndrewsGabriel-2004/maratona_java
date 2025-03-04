package maratonajava.javacore.Gassociacao.domain;

public class ProfessorSeminario {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    //construtor
    public ProfessorSeminario(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void printSeminarios(){
        System.out.println("Seminários: ");
        for(Seminario num: seminarios){
            if(num == null) {
                return;
            }
            System.out.println(num.getTitulo());
        }
    }

    //getter & setter

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}
