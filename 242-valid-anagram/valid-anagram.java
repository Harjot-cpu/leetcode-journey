class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] check = new int[256];
        
        for(int i = 0;i<s.length();i++){
            char a = s.charAt(i);
            char b = t.charAt(i);

            check[a] +=1;
            check[b] -=1; 
        }

        for(int i =0;i<check.length;i++){
            if(check[i] !=0) return false;
        }
        return true;
    }
}