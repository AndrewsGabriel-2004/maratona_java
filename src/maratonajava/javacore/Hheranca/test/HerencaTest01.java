package maratonajava.javacore.Hheranca.test;

import maratonajava.javacore.Hheranca.domain.Endereco;
import maratonajava.javacore.Hheranca.domain.Funcionario;
import maratonajava.javacore.Hheranca.domain.Pessoa;

import java.sql.SQLOutput;

public class HerencaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua José Gonçalves");
        endereco.setCep("56203-54");
        Pessoa pessoa = new Pessoa();
        pessoa.setName("Andrews Gabriel");
        pessoa.setCpf("111111111-55");
        pessoa.setEndereco(endereco);

        pessoa.print();

        Funcionario funcionario = new Funcionario();

        funcionario.setSalario(4500);
        funcionario.setName("Oda Nobunaga");
        funcionario.setEndereco(endereco);
        funcionario.setCpf("091-6243513");

        funcionario.print();
    }
}
