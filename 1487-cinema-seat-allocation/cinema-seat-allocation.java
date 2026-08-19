

class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        int ans = 0;

        Arrays.sort(reservedSeats, (a, b) -> {
            if (a[0] != b[0])
                return a[0] - b[0];

            return a[1] - b[1];
        });

        int k = 0;
        int previousRow = 0;

        while (k < reservedSeats.length) {

            int currentRow = reservedSeats[k][0];

            // Rows with no reservations before this row
            ans += (currentRow - previousRow - 1) * 2;

            boolean[] reserved = new boolean[11];

            // Store reservations of current row
            while (k < reservedSeats.length &&
                   reservedSeats[k][0] == currentRow) {

                reserved[reservedSeats[k][1]] = true;
                k++;
            }

            boolean group1 = true; // 2-5
            boolean group2 = true; // 4-7
            boolean group3 = true; // 6-9

            // Check 2-5
            for (int j = 2; j <= 5; j++) {
                if (reserved[j]) {
                    group1 = false;
                    break;
                }
            }

            // Check 4-7
            for (int j = 4; j <= 7; j++) {
                if (reserved[j]) {
                    group2 = false;
                    break;
                }
            }

            // Check 6-9
            for (int j = 6; j <= 9; j++) {
                if (reserved[j]) {
                    group3 = false;
                    break;
                }
            }

            if (group1 && group3) {
                ans += 2;
            }
            else if (group1 || group2 || group3) {
                ans += 1;
            }

            previousRow = currentRow;
        }

        // Rows after the last reserved row
        ans += (n - previousRow) * 2;

        return ans;
    }
}