public class MatrixMedian {

    private static int countLessThanOrEqual(int[] row, int x) {
        int low = 0, high = row.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (row[mid] <= x) low = mid + 1;
            else high = mid;
        }
        return low;
    }

   
    public static int findMedian(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

       
        for (int i = 0; i < r; i++) {
            min = Math.min(min, matrix[i][0]);
            max = Math.max(max, matrix[i][c - 1]);
        }

        int desired = (r * c + 1) / 2; 

 
        while (min < max) {
            int mid = min + (max - min) / 2;
            int count = 0;

            
            for (int i = 0; i < r; i++) {
                count += countLessThanOrEqual(matrix[i], mid);
            }

           
            if (count < desired) min = mid + 1;
            else max = mid;
        }

        return min;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5},
            {2, 6, 9},
            {3, 6, 9}
        };

        System.out.println("Median: " + findMedian(matrix));
    }
}
