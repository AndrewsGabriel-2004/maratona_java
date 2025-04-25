package maratonajava.javacore.Xserializacao.test;

import maratonajava.javacore.Xserializacao.dominio.Class;
import maratonajava.javacore.Xserializacao.dominio.Student;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Student st = new Student(1L, "AndrewsGabriel", "123456");
        Class turma = new Class("Maratona Java ricoss");
        st.setTurma(turma);
        serializar(st);
        deserializar();
    }

    private static void serializar(Student st){
        Path path = Paths.get("pasta/student.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(st);
        }catch (IOException e ){
            throw new RuntimeException();
        }
    }
    private static void deserializar(){
        Path path = Paths.get("pasta/student.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Student student = (Student) ois.readObject();
            //constructor's object is ignored
            System.out.println(student.toString());
        }catch (IOException| ClassNotFoundException e){
            throw new RuntimeException();
        }
    }
}
