package maratonajava.introducao.aula08;
import java.util.Scanner;

public class Aula08ArraysMultiDimensionais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // os meses 1,2,3,4,5...
        //dias do mes   dias

        int[][] days = new int[3][3];

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < days.length; j++) {

                System.out.print("Write the number of Matriz[" +i+","+j+"]: ");
                days[i][j] = sc.nextInt();

            }
        }

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < days[i].length; j++) {

                System.out.println(days[i][j]);


            }
        }

        for(int[] arrBase:days){
            for (int num: arrBase){
                System.out.println(num);

            }
        }






    }
}
