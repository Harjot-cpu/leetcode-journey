class Solution {
    public int beautySum(String s) {
        int count = 0;

        for(int i = 0; i < s.length(); i++) {
            int[] extra = new int[256];

            for(int j = i; j < s.length(); j++) {
                extra[s.charAt(j)]++;

                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;

                for(int k = 97; k <= 122; k++) {
                    if(extra[k] > max)
                        max = extra[k];

                    if(extra[k] > 0 && extra[k] < min)
                        min = extra[k];
                }

                count += max - min;
            }
        }

        return count;
    }
}