public class MatrixSearch {
    public static boolean search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

      
        int i = 0, j = cols - 1;

        while (i < rows && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] < target) {
                i++; 
            } else {
                j--; 
            }
        }

        return false; 
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {3, 30, 38},
            {20, 52, 54},
            {35, 60, 69}
        };
        int target = 52;

        if (search(matrix, target)) {
            System.out.println("Element found.");
        } else {
            System.out.println("Element not found.");
        }
    }
}
