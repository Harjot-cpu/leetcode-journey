class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        int[] arr = new int[m + 1];
        java.util.Arrays.fill(arr, -1);
        arr[m] = n;

        int j = n - 1;
        for (int i = m - 1; i >= 0; i--) {
            while (j >= 0 && word2.charAt(i) != word1.charAt(j)) {
                j -= 1;
            }
            arr[i] = j;
            if (j >= 0) {
                j -= 1;
            }
        }

        int loop = 0;
        int count = 0;
        int[] ans = new int[m];

        for (int i = 0; i < m; i++) {
            boolean found = false;
            while (loop < n) {
                boolean check = (word1.charAt(loop) == word2.charAt(i));

                if (check) {
                    if (count == 0 || loop < arr[i + 1]) {
                        ans[i] = loop;
                        loop += 1;
                        found = true;
                        break;
                    }
                } else if (count == 0 && loop < arr[i + 1]) {
                    ans[i] = loop;
                    count = 1;
                    loop += 1;
                    found = true;
                    break;
                }
                loop += 1;
            }

            if (!found) return new int[0];
        }

        return ans;
    }
}