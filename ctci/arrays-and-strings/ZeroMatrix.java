import java.util.*;

public class ZeroMatrix {
    public static void setZero(int[][] matrix) {
        // accumulate the rows and columns where there are 0s
        Set<Integer> rows = new HashSet<Integer>();
        Set<Integer> cols = new HashSet<Integer>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            if (rows.contains(i))
                Arrays.fill(matrix[i], 0);
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (cols.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] {
            {1, 0, 1},
            {2, 3, 7}, 
            {6, 1, 2}
        };

        setZero(matrix);

        for (int[] row: matrix) {
            for (int value: row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
 }
