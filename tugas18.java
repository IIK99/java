import java.util.Random;

public class tugas18 {
    public static void main(String[] args) {
        int[][] matrix = new int[7][5];
        Random rand = new Random();

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = rand.nextInt(100); 
            }
        }

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
