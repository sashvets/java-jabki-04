import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkTest {

    @Test
    public void testSumArr() {
        assertEquals(15, Homework.sumArr(new int[]{1, 2, 3, 4, 5}));
        assertThrows(IllegalArgumentException.class, () -> Homework.sumArr(new int[]{}));
        assertThrows(IllegalArgumentException.class, () -> Homework.sumArr(null));
    }

    @Test
    public void testMinOfArr() {
        assertEquals(-44, Homework.minOfArr(new int[]{1, 2, 3, -44, 5}));
        assertThrows(IllegalArgumentException.class, () -> Homework.minOfArr(new int[]{}));
        assertThrows(IllegalArgumentException.class, () -> Homework.minOfArr(null));
    }

    @Test
    public void testInvertArr() {
        int[] arrIn = new int[]{1, 2, 3, 4, 5};
        int[] arrOut = new int[]{5, 4, 3, 2, 1};
        Homework.invertArr(arrIn);
        assertArrayEquals(arrOut, arrIn);
    }

    @Test
    public void testFoundDuplicates() {
        assertFalse(Homework.foundDuplicates(new int[]{1, 2, 3, 4, 5}));
        assertTrue(Homework.foundDuplicates(new int[]{1, 2, 3, 4, 5, 2}));
        assertThrows(IllegalArgumentException.class, () -> Homework.foundDuplicates(new int[]{}));
        assertThrows(IllegalArgumentException.class, () -> Homework.foundDuplicates(null));
    }

    @Test
    public void testAbsNegative() {
        int[] arrIn = new int[]{1, -2, 3, -4, 5};
        int[] arrOut = new int[]{1, 2, 3, 4, 5};
        Homework.absNegative(arrIn);
        assertArrayEquals(arrOut, arrIn);
        assertThrows(IllegalArgumentException.class, () -> Homework.absNegative(new int[]{}));
        assertThrows(IllegalArgumentException.class, () -> Homework.absNegative(null));
    }

    @Test
    public void testSumMatrix() {
        int[][] matrix = {{1, 3, 3}, {3, 3, 3}, {3, 3, 3}};
        assertEquals(25, Homework.sumMatrix(matrix));
        int[][] raggedMatrix = {{1, 3, 3}, {3, 3}, {3}};
        assertEquals(16, Homework.sumMatrix(raggedMatrix));
        int[][] withMinusMatrix = {{1, -3, 3}, {3, -3}, {3, -1, -3}};
        assertEquals(0, Homework.sumMatrix(withMinusMatrix));
        assertThrows(IllegalArgumentException.class, () -> Homework.sumMatrix(new int[][]{}));
        assertThrows(IllegalArgumentException.class, () -> Homework.sumMatrix(null));
    }

    @Test
    public void testIsSquareArray() {
        assertTrue(Homework.isSquareArray(new int[][]{{1, 3, 3}, {3, 3, 3}, {3, 3, 3}}));
        assertFalse(Homework.isSquareArray(new int[][]{{1, 3, 3}, {3}, {3, 3, 3}}));
        assertFalse(Homework.isSquareArray(new int[][]{{1, 3, 3}, null, {3, 3, 3}}));
        assertTrue(Homework.isSquareArray(new int[][]{}));
        assertFalse(Homework.isSquareArray(null));
    }

    @Test
    public void testFillArrayByEvenOdd() {
        int[][] matrix = new int[3][3];
        int[][] matrixOut = {{0, -1, 0}, {-1, 0, -1}, {0, -1, 0}};
        Homework.fillArrayByEvenOdd(matrix);
        assertArrayEquals(matrixOut, matrix);
        assertThrows(IllegalArgumentException.class, () -> Homework.fillArrayByEvenOdd(new int[][]{}));
        assertThrows(IllegalArgumentException.class, () -> Homework.fillArrayByEvenOdd(null));
    }
}