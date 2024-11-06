package pa7.kalijavetski;

public class Q3 {
    static public int maxAreaOfIsland(int[][] grid) {
        int max_area = 0;
        int num_rows = grid.length;
        if (num_rows == 0){
            return max_area;
        }
        int num_cols = grid[0].length;
        boolean[][] visited = new boolean[num_rows][num_cols];
        for (int i=0; i<num_rows; i++){
            for (int j=0; j<num_cols; j++){
                visited[i][j] = false;
            }
        }
        for (int i=0; i<num_rows; i++){
            for (int j=0; j<num_cols; j++){
                if ((grid[i][j] == 1)&&(visited[i][j]==false)){
                    int isl_area = count_dfs(grid,visited,i,j);
                    if (isl_area > max_area){
                        max_area = isl_area;
                    }
                }
            }
        }
        return max_area; 
    }
    static private int count_dfs(int[][] grid, boolean[][] visited, int i, int j){
        int num_rows = grid.length;
        int num_cols = grid[0].length;
        if ((i < 0 ) || (i > num_rows-1)){
            return 0;
        }
        if ((j < 0) || (j > num_cols-1)){
            return 0;
        }
        if (grid[i][j] == 0){
            return 0;
        }
        if (visited[i][j] == true){
            return 0;
        }
        visited[i][j] = true;
        int isl_area = 1;
        isl_area = isl_area + count_dfs(grid, visited,i+1,j); 
        isl_area = isl_area + count_dfs(grid, visited,i-1,j); 
        isl_area = isl_area + count_dfs(grid, visited,i,j-1); 
        isl_area = isl_area + count_dfs(grid, visited,i,j+1); 
        return isl_area;
    }
    
}
