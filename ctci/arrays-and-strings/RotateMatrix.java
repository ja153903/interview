import java.util.*;

public class RotateMatrix {
    public static void rotate(int[][] matrix) {
        // reverse the inner arrays
        for (int i = 0, j = matrix.length-1; i < j; i++, j--) {
            int[] temp = matrix[i];
            matrix[i] = matrix[j];
            matrix[j] = temp;
        }
        
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (!visited[i][j]) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;

                    visited[i][j] = visited[j][i] = true;
                }
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                String s = j == matrix[i].length - 1 ? "" : " ";
                System.out.print(matrix[i][j] + s);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        printMatrix(matrix);

        rotate(matrix);

        printMatrix(matrix);
    }
}
