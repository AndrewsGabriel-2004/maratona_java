package maratonajava.javacore.Hheranca.domain;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco de Inicialização estático de Funcionário");

    }
    {
        System.out.println("Dentro do bloco de Inicialização de Funcionário");
    }
    {
        System.out.println("Dentro do bloco de Inicialização de Funcionário");
    }

    //construtor
    public Funcionario(String name){
        super(name);
        System.out.println("Dentro do construtor de Funcionário");
    }

    public void print() {
        super.print();
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.name + "recebi o salario de " + this.salario);


    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
