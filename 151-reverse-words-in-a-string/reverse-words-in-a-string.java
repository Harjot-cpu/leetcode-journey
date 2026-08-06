class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int last = s.length();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (i + 1 < last) { // Word exists
                    if (ans.length() > 0) ans.append(" ");
                    ans.append(s.substring(i + 1, last));
                }
                last = i;
            }
        }

        // Add the first word
        if (last > 0) {
            if (ans.length() > 0) ans.append(" ");
            ans.append(s.substring(0, last));
        }

        return ans.toString();
    }
}