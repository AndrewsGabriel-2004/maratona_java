package maratonajava.javacore.Npolimorfismo.test;

import maratonajava.javacore.Npolimorfismo.repository.Repository;
import maratonajava.javacore.Npolimorfismo.service.RepositoryDatabase;
import maratonajava.javacore.Npolimorfismo.service.RepositoryFile;

import java.util.ArrayList;
import java.util.List;

public class RepositoryTest {
    public static void main(String[] args) {
        Repository repository = new RepositoryDatabase();
        repository.save();
        List<String> list = new ArrayList<>();
        list.add("Goku");
        list.add("kuririn");
        list.add("Vegeta");
        System.out.println(list);
    }
}
