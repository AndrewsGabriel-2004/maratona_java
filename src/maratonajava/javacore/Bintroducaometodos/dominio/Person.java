package maratonajava.javacore.Bintroducaometodos.dominio;

public class Person {
    private String name;
    private int age;

    public void print(){
        System.out.println(getName());
        System.out.println(getAge());
    }

    public void setAge(int age){
        if(age < 0){
            System.out.println("Invalid Age");
            return;
        }
        this.age = age;   //this is just to appoint the correct variable
    }
    public void setName(String X){
        name = X;

    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}
