import java.util.Arrays;

public class MatrixRotation {
   
    public static void rotate(int[][] mat) {
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
               
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            int low = 0, high = n - 1;
            while (low < high) {
              
                int temp = mat[i][low];
                mat[i][low] = mat[i][high];
                mat[i][high] = temp;
                low++;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        for (int[] row : mat) {
            System.out.println(Arrays.toString(row));
        }

        rotate(mat);

        System.out.println("\nRotated Matrix:");
        for (int[] row : mat) {
            System.out.println(Arrays.toString(row));
        }
    }
}
