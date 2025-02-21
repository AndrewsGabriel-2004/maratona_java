package maratonajava.introducao.aula06;

public class Aula06RepetitionStructures01 {
    public static void main(String[] args) {
        //While,do while, for

        int count = 11;

        //while
        while(count < 10){
            System.out.println(++count);
        }

        //do while
        do {
            System.out.println(++count);
        }
        while (count <10);

        //for
        for(int i=0; i <10; i++){
            System.out.println("FOR " +i);
        }


    }
}
