package maratonajava.javacore.Bintroducaometodos.dominio;

public class Car {
    public String name;
    public String model;
    public int year;

    public void showDetails(){

        System.out.println("Name: "+name);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);

        System.out.println("----------------------");

    }

    public int calcularity(int actualYear){

       return (actualYear - year);

    }

    public void newest(int ageCar2, int ageCar3){

        System.out.println("----------------------");

        if(ageCar2 > ageCar3){
            System.out.println("The newest is the car Andrews");
        }else{
            System.out.println("The newest is the car Andrielly");
        }
    }

    public void showDetails2(Car car){

        System.out.println(car.name);
        System.out.println(car.model);
        System.out.println(car.year);

        System.out.println("----------------------");

    }

    public void showDetails3(){

        System.out.println(this.name);
        System.out.println(this.model);
        System.out.println(this.year);

    }
}
