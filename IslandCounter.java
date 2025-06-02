public class IslandCounter {

    private static final int[] ROW_DIR = {-1, 1, 0, 0};
    private static final int[] COL_DIR = {0, 0, -1, 1};

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int rows = grid.length;
        int cols = grid[0].length;
        int islandCount = 0;

     
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
               
                if (grid[i][j] == '1') {
                    dfs(grid, i, j, rows, cols);
                    islandCount++;
                }
            }
        }
        return islandCount;
    }

 
    private void dfs(char[][] grid, int i, int j, int rows, int cols) {
       
        if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] == '0') return;


        grid[i][j] = '0';

      
        for (int d = 0; d < 4; d++) {
            int newRow = i + ROW_DIR[d];
            int newCol = j + COL_DIR[d];
            dfs(grid, newRow, newCol, rows, cols);
        }
    }

    public static void main(String[] args) {
        IslandCounter counter = new IslandCounter();
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        System.out.println("Number of islands: " + counter.numIslands(grid));
    }
}
public class IslandCounter {


    private static final int[] ROW_DIR = {-1, 1, 0, 0};
    private static final int[] COL_DIR = {0, 0, -1, 1};

  
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int rows = grid.length;
        int cols = grid[0].length;
        int islandCount = 0;

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                
                if (grid[i][j] == '1') {
                    dfs(grid, i, j, rows, cols);
                    islandCount++;
                }
            }
        }
        return islandCount;
    }

    private void dfs(char[][] grid, int i, int j, int rows, int cols) {

        if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] == '0') return;


        grid[i][j] = '0';

 
        for (int d = 0; d < 4; d++) {
            int newRow = i + ROW_DIR[d];
            int newCol = j + COL_DIR[d];
            dfs(grid, newRow, newCol, rows, cols);
        }
    }

    public static void main(String[] args) {
        IslandCounter counter = new IslandCounter();
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        System.out.println("Number of islands: " + counter.numIslands(grid));
    }
}
