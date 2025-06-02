public class MatrixSearch1 {
    public static boolean linearSearch(int[][] matrix, int target) {
        for (int[] row : matrix) {
            for (int num : row) {
                if (num == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 9},
            {14, 20, 21},
            {30, 34, 43}
        };
        int target = 20;
        if (linearSearch(matrix, target)) {
            System.out.println("Element found.");
        } else {
            System.out.println("Element not found.");
        }
    }
}
