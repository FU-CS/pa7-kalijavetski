package pa7.kalijavetski;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Q3Test {
    @Test
    void testOne_Isl() {
        int[][] matrix = {
            {1,1,1,1,0},
            {1,1,0,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0}};
        assertEquals(6,Q3.maxAreaOfIsland(matrix));
    }
    @Test
    void testMult_Isl() {
        int[][] matrix = {
            {0,0,1,1,1},
            {1,1,0,0,0},
            {0,0,0,0,0},
            {0,1,0,0,0}};
        assertEquals(3,Q3.maxAreaOfIsland(matrix));
    }
    @Test
    void testNo_Isl() {
        int[][] matrix = {
            {0,0,0,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0}};
        assertEquals(0,Q3.maxAreaOfIsland(matrix));
    }
    @Test
    void testAll_Isl() {
        int[][] matrix = {
            {1,1,1,1,1},
            {1,1,1,1,1},
            {1,1,1,1,1}};
        assertEquals(15,Q3.maxAreaOfIsland(matrix));
    }
    @Test
    void testDiag_isl() {
        int[][] matrix = {
            {1,0,0,0},
            {0,1,0,0},
            {0,0,1,0},
            {0,0,0,1}};
        assertEquals(1,Q3.maxAreaOfIsland(matrix));
    }
    @Test
    void testEmpty() {
        int[][] matrix = {};
        assertEquals(0,Q3.maxAreaOfIsland(matrix));
    }

}
