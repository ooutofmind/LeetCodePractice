package N1329;

import java.util.PriorityQueue;

public class SortTheMatrixDiagonally {

    private final PriorityQueue<Integer> pq = new PriorityQueue<>();
    public int[][] diagonalSort(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;

        for (int i = 0; i < cols - 1; i++) {
            sortDiagonal(mat, 0, i);
            setSorted(mat, 0, i);
        }

        for (int i = 1; i < rows - 1; i++) {
            sortDiagonal(mat, i, 0);
            setSorted(mat, i, 0);
        }

        return mat;
    }

    void sortDiagonal(int[][] arr, int row, int col) {
        pq.add(arr[row][col]);

        if(row + 1 >= arr.length || col + 1 >= arr[row].length) {
            return;
        }

        sortDiagonal(arr, ++row, ++col);
    }

    void setSorted(int[][] arr, int row, int col) {
        //noinspection ConstantConditions
        arr[row][col] = pq.poll();

        if(row + 1 >= arr.length || col + 1 >= arr[row].length) {
            return;
        }

        setSorted(arr, ++row, ++col);
    }
}
