package pa7.kalijavetski;
public class Q1 {
    static public void rotate(int[][] matrix) {
        int num_rows = matrix.length;
        if (matrix.length == 0){
            return;
        }
        else{
            for (int i = 0; i < num_rows; i++){
                for (int j = i + 1; j < num_rows; j++){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }

            for (int i = 0; i < num_rows; i++){
                for (int j = 0; j < num_rows/2; j++){
                    int reverse = matrix[i][j];
                    matrix[i][j] = matrix[i][num_rows-j-1];
                    matrix[i][num_rows-j-1] = reverse;
                }
            }
            // testing to see what was printed as I worked through code
            // for (int[] row : matrix) {
            //     for (int val : row) {
            //         System.out.print(val + " ");
            //     }
            //     System.out.println();
            // } 
        }
    }
}
    
