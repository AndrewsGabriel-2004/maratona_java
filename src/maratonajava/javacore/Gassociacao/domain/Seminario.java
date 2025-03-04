package maratonajava.javacore.Gassociacao.domain;

import java.util.Scanner;

public class Seminario {
    private String titulo;
    private AlunoSeminario[] alunosDoSeminario;
    private LocalSeminario localSeminario;
    private ProfessorSeminario professorSeminario;

    //construtor

    public Seminario(String titulo,AlunoSeminario[] alunosSeminario) {
        this.titulo = titulo;
        this.alunosDoSeminario = alunosSeminario;
    }

    public void print(){
        System.out.println("-------------------------");
        System.out.println("Título: "+getTitulo());

        System.out.println("------");
        System.out.println("Alunos: ");
        for(AlunoSeminario num:alunosDoSeminario) {
            if(num == null){
                return;
            }
            System.out.println(num.getNome());
        }

        System.out.println("------");
        System.out.println("Local: "+ localSeminario.getEndereco());

        System.out.println("------");
        System.out.println("Professores: "+ professorSeminario.getNome());
    }

    //getter & setter
    public String getTitulo() {
        return titulo;
    }

    public LocalSeminario getLocalSeminario() {
        return localSeminario;
    }

    public void setLocalSeminario(LocalSeminario localSeminario) {
        this.localSeminario = localSeminario;
    }

    public ProfessorSeminario getProfessorSeminario() {
        return professorSeminario;
    }

    public void setProfessorSeminario(ProfessorSeminario professorSeminario) {
        this.professorSeminario = professorSeminario;
    }
}
