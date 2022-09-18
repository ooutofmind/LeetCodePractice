package N1329;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

class SortTheMatrixDiagonallyTest {

    @Test
    void diagonalSort() {
        var instance = new SortTheMatrixDiagonally();
        int[][] initialMatrix = new int[][]{{3, 3, 1, 1}, {2, 2, 1, 2}, {1, 1, 1, 2}};
        var actual = instance.diagonalSort(initialMatrix);
        int[][] expectedMatrix = new int[][]{{1, 1, 1, 1}, {1, 2, 2, 2}, {1, 2, 3, 3}};
        assertThat(actual).isEqualTo(expectedMatrix);
    }
}