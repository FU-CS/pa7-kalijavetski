package pa7.kalijavetski;

public class Q2 {
    static public int numIslands(char[][] grid) {
        int island_count = 0;
        int num_rows = grid.length;
        if (num_rows == 0){
            return island_count;
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
                if ((grid[i][j] == '1')&&(visited[i][j]==false)){
                    island_count = island_count + 1;
                    helper_dfs(grid,visited,i,j);
                }
            }
        }
        return island_count;
    }

    static private void helper_dfs(char[][] grid, boolean[][] visited, int i, int j){
        int num_rows = grid.length;
        int num_cols = grid[0].length;
        if ((i < 0 ) || (i > num_rows-1)){
            return;
        }
        if ((j < 0) || (j > num_cols-1)){
            return;
        }
        if (grid[i][j] == '0'){
            return;
        }
        if (visited[i][j] == true){
            return;
        }
        visited[i][j] = true;
        helper_dfs(grid, visited,i+1,j); 
        helper_dfs(grid, visited,i-1,j); 
        helper_dfs(grid, visited,i,j-1); 
        helper_dfs(grid, visited,i,j+1); 
    }
}
