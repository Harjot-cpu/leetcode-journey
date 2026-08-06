class Solution {
    public String longestCommonPrefix(String[] strs) {
     
        String smallest = strs[0];
        for (String str : strs) {
            if (str.length() < smallest.length()) {
                smallest = str;
            }
        }

   
        for (int i = 0; i < smallest.length(); i++) {
            char ch = smallest.charAt(i);

            for (String str : strs) {
                if (str.charAt(i) != ch) {
                    return smallest.substring(0, i);
                }
            }
        }

        return smallest;
    }
}