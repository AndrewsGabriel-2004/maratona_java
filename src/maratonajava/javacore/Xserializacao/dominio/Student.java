package maratonajava.javacore.Xserializacao.dominio;

import java.io.*;

public class Student implements Serializable {
    private static final long serialVersionUID = -7009046240031177228L;
    private Long id;
    private String nome;
    private transient Class turma;
    private transient String password;//ignore the password in the transcription(transient)
    private static final String NOME_ESCOLA = "DevDojo Academy";

    public Student(Long id, String nome, String password) {
        System.out.println("Dentro do Construtor");
        this.id = id;
        this.nome = nome;
        this.password = password;
    }
    private void writeObject(ObjectOutputStream oos){
        try{
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome()); //os atributos estão disponíveis, mas o objeto não
        }catch (IOException e){
            throw new RuntimeException();
        }
    }

    private void readObject(ObjectInputStream ois){
        try{
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
            turma = new Class(nomeTurma);
        }catch (IOException| ClassNotFoundException e){
            throw new RuntimeException();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", ESCOLA='" + NOME_ESCOLA + '\'' +
                ", Turma='" + turma + '\'' +
                '}';
    }

    public Class getTurma() {
        return turma;
    }

    public void setTurma(Class turma) {
        this.turma = turma;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
