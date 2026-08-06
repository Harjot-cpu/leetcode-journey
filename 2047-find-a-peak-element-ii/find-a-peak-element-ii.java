class Solution {
    public int[] findPeakGrid(int[][] mat) {

        int low = 0;
        int high = mat[0].length - 1;
        int n = mat.length;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int row = findmax(mat, n, mid);

            int left = (mid == 0) ? -1 : mat[row][mid - 1];
            int right = (mid == mat[0].length - 1) ? -1 : mat[row][mid + 1];

            if (mat[row][mid] > left && mat[row][mid] > right) {
                return new int[]{row, mid};
            } else if (mat[row][mid] < left) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return new int[]{-1, -1};
    }

    public int findmax(int[][] mat, int n, int col) {
        int max = Integer.MIN_VALUE;
        int row = 0;

        for (int i = 0; i < n; i++) {
            if (mat[i][col] > max) {
                max = mat[i][col];
                row = i;
            }
        }

        return row;
    }
}