class Solution {
    public String frequencySort(String s) {

        int[] freq = new int[128];

        for(char c : s.toCharArray()) {
            freq[c]++;
        }

        ArrayList<int[]> arr = new ArrayList<>();

        for(int i = 0; i < 128; i++) {
            if(freq[i] > 0) {
                arr.add(new int[]{i, freq[i]});
            }
        }

        arr.sort((a, b) -> b[1] - a[1]);

        StringBuilder ans = new StringBuilder();

        for(int[] pair : arr) {
            char ch = (char) pair[0];
            int count = pair[1];

            while(count-- > 0) {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}