package maratonajava.javacore.Gassociacao.domain;

public class AlunoSeminario {
    private String nome;
    private int idade;
    private Seminario seminario;

    //construtor
    public AlunoSeminario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //setter & getter
    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }
}
