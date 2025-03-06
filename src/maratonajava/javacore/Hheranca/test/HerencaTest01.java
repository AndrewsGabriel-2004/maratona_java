package maratonajava.javacore.Hheranca.test;

import maratonajava.javacore.Hheranca.domain.Endereco;
import maratonajava.javacore.Hheranca.domain.Funcionario;
import maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerencaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua José Gonçalves");
        endereco.setCep("56203-54");
        Pessoa pessoa = new Pessoa("Andrews");
        pessoa.setEndereco(endereco);

        pessoa.print();

        Funcionario funcionario = new Funcionario("Gabriel");

        funcionario.setSalario(4500);
        funcionario.setEndereco(endereco);

        funcionario.print();


    }
}
