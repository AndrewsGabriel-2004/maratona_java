package maratonajava.javacore.Zgenerics.test;

import maratonajava.javacore.Zgenerics.Service.BoatService;
import maratonajava.javacore.Zgenerics.domain.Boat;

public class GenericClassTest02 {
    public static void main(String[] args) {
        BoatService boatService = new BoatService();
        Boat boat = boatService.retrieveAvailableBoat();
        System.out.println("Using the boat for 1 month");
        boatService.returnRentBoat(boat);

    }
}
