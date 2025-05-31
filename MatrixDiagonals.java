public class MatrixDiagonals {
    public static void printDiagonals(int[][] matrix) {
        int n = matrix.length;

      
        System.out.print("Principal Diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

       
        System.out.print("Secondary Diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][n - 1 - i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        printDiagonals(matrix);
    }
}
