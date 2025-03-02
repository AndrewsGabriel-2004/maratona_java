package maratonajava.ExercisePOO.domain;

public class MatrizResult {
    public int[][] arrayMatrizR;

    public MatrizResult(Matriz matriz1) {
        arrayMatrizR = new int[matriz1.getX()][matriz1.getY()];
    }

    public void somaMatriz(Matriz matriz1, Matriz matriz2) {
        for (int i = 0; i < matriz1.getX(); i++) {
            for (int j = 0; j < matriz1.getY(); j++) {
                arrayMatrizR[i][j] = (matriz1.getArrayMatriz()[i][j] + matriz2.getArrayMatriz()[i][j]);
            }
        }

    }

    public void print(Matriz matriz1, Matriz matriz2){
        for (int i = 0; i < matriz1.getX(); i++) {
            for (int j = 0; j < matriz1.getY(); j++) {
                System.out.println("Matriz["+i+","+j+"]:"+arrayMatrizR[i][j]);
            }
        }
    }

}
