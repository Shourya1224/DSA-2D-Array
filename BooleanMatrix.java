public class BooleanMatrix {
    public static void booleanMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

       
        boolean[] rowFlag = new boolean[rows];
        boolean[] colFlag = new boolean[cols];

     
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1) {
                    rowFlag[i] = true;
                    colFlag[j] = true;
                }
            }
        }

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (rowFlag[i] || colFlag[j]) {
                    matrix[i][j] = 1;
                }
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {0, 0, 1},
            {0, 0, 0},
            {1, 0, 0}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        booleanMatrix(matrix);

        System.out.println("\nModified Matrix:");
        printMatrix(matrix);
    }
}
