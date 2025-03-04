package maratonajava.javacore.Gassociacao.test;

import maratonajava.javacore.Gassociacao.domain.AlunoSeminario;
import maratonajava.javacore.Gassociacao.domain.LocalSeminario;
import maratonajava.javacore.Gassociacao.domain.ProfessorSeminario;
import maratonajava.javacore.Gassociacao.domain.Seminario;


public class SeminarioTest {
    public static void main(String[] args) {

        AlunoSeminario aluno1 = new AlunoSeminario("Andrews Gabriel", 20);
        AlunoSeminario aluno2 = new AlunoSeminario("Andriely Pontes", 39);
        AlunoSeminario aluno3 = new AlunoSeminario("João Pedro", 31);
        AlunoSeminario aluno4 = new AlunoSeminario("Carlos Leal", 19);

        AlunoSeminario[] alunoSeminarios1 = new AlunoSeminario[]{aluno1,aluno3};
        AlunoSeminario[] alunoSeminarios2 = new AlunoSeminario[]{aluno2,aluno4};

        Seminario seminario1 = new Seminario("24º Seminário de TI",alunoSeminarios1);
        Seminario seminario2 = new Seminario("25º Seminário de Farmácia",alunoSeminarios2);

        Seminario[] prof1Seminarios = new Seminario[]{seminario1};
        Seminario[] prof2Seminarios = new Seminario[]{seminario1,seminario2};

        ProfessorSeminario prof1 = new ProfessorSeminario("Geraldo", "Redes", prof1Seminarios);
        ProfessorSeminario prof2 = new ProfessorSeminario("Humberto", "Fisiologia & Hardware", prof2Seminarios);

        LocalSeminario local1 = new LocalSeminario("Rio de Janeiro");
        LocalSeminario local2 = new LocalSeminario( "João Pessoa");

        seminario1.setLocalSeminario(local1);
        seminario2.setLocalSeminario(local2);

        seminario1.setProfessorSeminario(prof1);
        seminario2.setProfessorSeminario(prof2);

        System.out.println("Informações do "+ seminario1.getTitulo()+": ");
        seminario1.print();
        System.out.println("Informações do "+ seminario2.getTitulo()+": ");
        seminario2.print();

        System.out.println("----------------------------------");

        System.out.println("Professores e seus respectivos seminários: ");
        System.out.println("Nome: "+ prof1.getNome());
        prof1.printSeminarios();
        System.out.println("Especialidade: "+ prof1.getEspecialidade());

        System.out.println("----------------------------------");

        System.out.println("Nome: "+prof2.getNome());
        prof2.printSeminarios();
        System.out.println("Especialidade: "+ prof2.getEspecialidade());

    }
}
