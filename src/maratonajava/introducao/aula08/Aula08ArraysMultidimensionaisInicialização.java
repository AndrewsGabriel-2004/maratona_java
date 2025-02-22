package maratonajava.introducao.aula08;
import java.util.Scanner;

public class Aula08ArraysMultidimensionaisInicialização {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] arrayInt = new int[3][];  //here the ref variable juts have nulls inside

        arrayInt[0] = new int[]{1,2};
        arrayInt[1] = new int[]{1,2,3};  // now yes we have a value in ref variable, in this case will be just a memory number
        arrayInt[2] = new int[]{1,2,3,4,5,6};

        for(int[] arrayBase: arrayInt){ //line
            for(int num:arrayBase){  //column

                System.out.print(num + " ");

            }
            System.out.println();
        }





    }
}
