public class LinearSearch2D {
    public static boolean search(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30},
            {15, 25, 35},
            {27, 29, 37}
        };
        int target = 25;
        System.out.println(search(matrix, target) ? "Found" : "Not Found");
    }
}
