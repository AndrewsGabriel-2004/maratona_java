package maratonajava.javacore.Bintroducaometodos.dominio;

public class Employee {
    public String name;
    public int age;
    public double[] salary;

    public void showDetails() {
        System.out.println(this.name);
        System.out.println(this.age);
        for(int i=0 ;i < salary.length;i++){
            System.out.print(salary[i] + " ");
        }
        System.out.println();
        System.out.println("---------------");
        arraySalary();
    }

    public void arraySalary(){

        double soma = 0;

        for(int i=0 ;i < salary.length;i++){
             soma += salary[i];
        }

        double average = soma/ salary.length;

        System.out.println("The Average is :"+ average);
     }

}