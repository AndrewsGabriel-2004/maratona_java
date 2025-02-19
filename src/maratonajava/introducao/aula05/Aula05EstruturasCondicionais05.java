package maratonajava.introducao.aula05;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // 1 é domingo
        byte day = 3;
        switch (day) {
            case 1:
            case 7:
                System.out.println("Weekend");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("util Day");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
        }
    }