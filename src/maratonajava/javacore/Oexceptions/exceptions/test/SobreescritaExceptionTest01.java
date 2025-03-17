package maratonajava.javacore.Oexceptions.exceptions.test;

import maratonajava.javacore.Oexceptions.exceptions.domain.Employee;
import maratonajava.javacore.Oexceptions.exceptions.domain.InvalidLoginException;
import maratonajava.javacore.Oexceptions.exceptions.domain.Person;

import java.io.FileNotFoundException;

public class SobreescritaExceptionTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();

        try {
            employee.save();
        } catch (InvalidLoginException | FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
