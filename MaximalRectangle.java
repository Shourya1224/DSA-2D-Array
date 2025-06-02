import java.util.Stack;

public class MaximalRectangle {
   
    private static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int i = 0;

        while (i < heights.length) {
        
            if (stack.isEmpty() || heights[i] >= heights[stack.peek()]) {
                stack.push(i++);
            } else {
              
                int top = stack.pop();
               
                int area = heights[top] * (stack.isEmpty() ? i : i - stack.peek() - 1);
               
                maxArea = Math.max(maxArea, area);
            }
        }

        while (!stack.isEmpty()) {
            int top = stack.pop();
            int area = heights[top] * (stack.isEmpty() ? i : i - stack.peek() - 1);
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

 
    public static int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return 0;

        int m = matrix.length;
        int n = matrix[0].length;
        int[] heights = new int[n];
        int maxArea = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
              
                heights[j] = (matrix[i][j] == '1') ? heights[j] + 1 : 0;
            }
            
            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }

        return maxArea;
    }

    public static void main(String[] args) {
        char[][] matrix = {
            {'1', '0', '1', '0', '0'},
            {'1', '0', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '0', '0', '1', '0'}
        };

        System.out.println("Maximal Rectangle Area: " + maximalRectangle(matrix));
    }
}
