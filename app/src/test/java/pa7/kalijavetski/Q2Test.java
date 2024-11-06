package pa7.kalijavetski;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Q2Test {
    @Test
    void testOne_Isl() {
        char[][] matrix = {
            {'1','1','1','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'},
            {'0','0','0','0','0'}};
        assertEquals(1,Q2.numIslands(matrix));
    }
    @Test
    void testMult_Isl() {
        char[][] matrix = {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','1'},
            {'0','0','0','1','1'}};
        assertEquals(2,Q2.numIslands(matrix));
    }
    @Test
    void testNo_Isl() {
        char[][] matrix = {
            {'0','0','0','0','0'},
            {'0','0','0','0','0'},
            {'0','0','0','0','0'},
            {'0','0','0','0','0'}};
        assertEquals(0,Q2.numIslands(matrix));
    }
    @Test
    void testAll_Isl() {
        char[][] matrix = {
            {'1','1','1','1','1'},
            {'1','1','1','1','1'},
            {'1','1','1','1','1'},
            {'1','1','1','1','1'}};
        assertEquals(1,Q2.numIslands(matrix));
    }
    @Test
    void testDiag_isl() {
        char[][] matrix = {
            {'1','0','0','0'},
            {'0','1','0','0'},
            {'0','0','1','0'},
            {'0','0','0','1'}};
        assertEquals(4,Q2.numIslands(matrix));
    }
    @Test
    void testEmpty() {
        char[][] matrix = {};
        assertEquals(0,Q2.numIslands(matrix));
    }
}
