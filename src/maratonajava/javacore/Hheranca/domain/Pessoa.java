package maratonajava.javacore.Hheranca.domain;

public class Pessoa {
    protected String name;
    protected String cpf;
    protected Endereco endereco;

    //bloco de inicializaçõa
    static {
    System.out.println("Dentro do bloco de Inicialização estático de Pessoa");

    }
    {
        System.out.println("Dentro do bloco de Inicialização de Pessoa1");
    }
    {
        System.out.println("Dentro do bloco de Inicialização de Pessoa2");
    }

    //construtor
    public Pessoa(String name){
        this.name = name;
        System.out.println("Dentro do construtor de Pessoa");
    }


    public void print(){
        System.out.println(this.name);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua());
        System.out.println(this.endereco.getCep());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
