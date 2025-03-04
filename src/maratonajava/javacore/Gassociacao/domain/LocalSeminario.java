package maratonajava.javacore.Gassociacao.domain;

public class LocalSeminario {
    private Seminario seminario;
    private String endereco;

    public LocalSeminario(String endereco) {
        this.endereco = endereco;

    }

    //setter e getter
    public String getEndereco() {
        return endereco;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
