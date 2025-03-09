package maratonajava.javacore.Lclassesabstratas.domain;

public class Developer extends Employee{
    public Developer(String name, double salary) {
        super(name, salary);
    }

    public void calculateBonus(){
        this.salary = this.salary + this.salary*0.01;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' + ", salary=" + this.salary + '}';
    }

}
