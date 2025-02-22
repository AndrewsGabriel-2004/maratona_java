package maratonajava.introducao.aula06;

public class Aula06RepetitionStructures04 {
    public static void main(String[] args) {
        //published a car value, discover in how many it can be parceled
        //condicion: valueParceled >= 1000

        int carValue = 30000;

        for (int parcel = 1; parcel <= carValue; parcel++) {
            double parcelValue = carValue / parcel;

            if (parcelValue < 1000) {
                break;
            }

            System.out.println("parcel "+ parcel + ": "+ parcelValue + " R$");
        }
    }
}