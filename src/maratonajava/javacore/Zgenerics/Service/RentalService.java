package maratonajava.javacore.Zgenerics.Service;

import java.util.List;

public class RentalService<T>{
    private List<T> objectsDisponible;

    public RentalService(List<T> objectsDisponible) {
        this.objectsDisponible = objectsDisponible;
    }

    public T retrieveAvailableObject(){
        System.out.println("Finding available object");
        T t = objectsDisponible.remove(0);
        System.out.println("Renting object: "+ t);
        System.out.print("Disponible objects for rent: ");
        System.out.println(objectsDisponible);
        return t;
    }
    public void returnRentObject(T t){
        System.out.println("Returning rent object: "+t);
        objectsDisponible.add(t);
        System.out.println("Disponible objects for rent: ");
        System.out.print(objectsDisponible);
    }
}
