package maratonajava.javacore.Bintroducaometodos.dominio;

public class EmployeeGPT {
    private String name;
    private int age;
    private double[] salary;
    private double average = 0;

    public void showDetails() {

        System.out.println(this.name);

        System.out.println(this.age);

        if(salary == null){
            return;
        }

        for(int i=0 ;i < salary.length;i++){
            System.out.print(salary[i] + " ");
        }

        System.out.println();

        System.out.println("---------------");

        arraySalary();
    }

    public void arraySalary(){


        if(salary == null){
            return;
        }

        for(int i=0 ;i < salary.length;i++){
             average += salary[i];
        }

        average /= salary.length;

        System.out.println("The Average is :"+ average);
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;                         //will never be used, switch off this method
    }

    public double[] getSalary() {
        return salary;
    }

    public void setSalary(double[] salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}