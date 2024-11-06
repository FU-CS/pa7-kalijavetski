package pa7.kalijavetski;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Q1Test {
    @Test
    void testRotate_empty() {
        int[][] matrix = {};
        Q1.rotate(matrix);
        int[][] expected = {};
        assertArrayEquals(expected,matrix);
    }
    @Test
    void testRotate_1() {
        int[][] matrix = {{1}};
        Q1.rotate(matrix);
        int[][] expected = {{1}};
        assertArrayEquals(expected,matrix);
    }
    @Test
    void testRotate_2x2() {
        int[][] matrix = {{1,2},{3,4}};
        Q1.rotate(matrix);
        int[][] expected = {{3,1},{4,2}};
        assertArrayEquals(expected,matrix);
    }
    @Test
    void testRotate_3x3() {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        Q1.rotate(matrix);
        int[][] expected = {{7,4,1},{8,5,2},{9,6,3}};
        assertArrayEquals(expected,matrix);
    }
    
}
