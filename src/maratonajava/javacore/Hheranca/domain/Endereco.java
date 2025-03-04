package maratonajava.javacore.Hheranca.domain;

public class Endereco {
    private String rua;
    private String cep;
    //deixar sem pessoa a deixa com baixo acoplamento (bom), pois eu posso reutilizar essa classe, e alterá-la sem me preocupar com associções



    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
