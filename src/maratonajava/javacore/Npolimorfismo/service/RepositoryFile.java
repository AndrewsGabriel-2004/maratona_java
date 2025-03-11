package maratonajava.javacore.Npolimorfismo.service;

import maratonajava.javacore.Npolimorfismo.repository.Repository;

public class RepositoryFile implements Repository {
    @Override
    public void save() {
        System.out.println("Saving on File");
    }
}
