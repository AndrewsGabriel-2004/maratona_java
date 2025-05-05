package maratonajava.javacore.Zgenerics.Service;

import maratonajava.javacore.Zgenerics.domain.Boat;

import java.util.ArrayList;
import java.util.List;

public class BoatService {
    private List<Boat> disponibleBoats = new ArrayList<>(List.of(new Boat("Lancha"), new Boat("Iate")));

    public Boat retrieveAvailableBoat(){
        System.out.println("Finding available Boat");
        Boat boat = disponibleBoats.remove(0);
        System.out.println("Renting Boat: "+ boat);
        System.out.print("Disponible Boats for rent: ");
        System.out.println(disponibleBoats);
        return boat;
    }
    public void returnRentBoat(Boat Boat){
        System.out.println("Returning rent Boat: "+Boat);
        disponibleBoats.add(Boat);
        System.out.println("Disponible Boats for rent: ");
        System.out.print(disponibleBoats);
    }

}
