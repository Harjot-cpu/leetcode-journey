class Solution {
    public boolean equalFrequency(String word) {

        int[] frq = new int[26];

        for (int i = 0; i < word.length(); i++) {
            frq[word.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {

            if (frq[i] == 0)
                continue;

            frq[i]--;

            if (check(frq))
                return true;

            frq[i]++;
        }

        return false;
    }

    public boolean check(int[] frq) {

        int common = 0;

        for (int i = 0; i < 26; i++) {

            if (frq[i] == 0)
                continue;

            if (common == 0)
                common = frq[i];

            else if (frq[i] != common)
                return false;
        }

        return true;
    }
}