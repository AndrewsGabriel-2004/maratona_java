package maratonajava.introducao.aula06;

public class Aula06RepetitionStructures05 {
    public static void main(String[] args) {
        //published a car value, discover in how many it can be parceled
        //condicion: valueParceled >= 1000

        double carValue = 30000;

        for (int parcel = (int)carValue; parcel >= 1; parcel--) {

            double valueParcel = carValue/parcel;
            if(valueParcel < 1000){
                continue;
            }
            System.out.println("parcel "+ parcel + ": "+ valueParcel + " R$");
        }
    }
}

