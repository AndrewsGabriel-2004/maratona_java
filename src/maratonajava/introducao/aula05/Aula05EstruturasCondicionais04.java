package maratonajava.introducao.aula05;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
    //print the day of the week considering 1 as sunday
        byte day = 2;

       switch (day) {
           case 1:
               System.out.println("Sunday");
               break;
           case 2:
               System.out.println("Monday");
               break;
           case 3:
               System.out.println("Tuesday");
               break;
           case 4:
               System.out.println("Wednesday");
               break;
           case 5:
               System.out.println("Thrusday");
               break;
           case 6:
               System.out.println("Friday");
               break;
           case 7:
               System.out.println("Saturday");
               break;
           default:
               System.out.println("Opção Inválida");
               break;
       }

    char gender = 'M';
    switch(gender) {
        case 'M':
            System.out.println("HOMEM");
            break;
        case 'F':
            System.out.println("MULHER");
            break;
        default:
            System.out.println("opção inválida");
            break;
    }



    }
}
