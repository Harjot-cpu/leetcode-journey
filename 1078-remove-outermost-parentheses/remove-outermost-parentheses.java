class Solution {
    public String removeOuterParentheses(String s) {
        String ans = "";
        int count= 0;
        char[] arr = s.toCharArray();
        for(int i = 0;i<arr.length;i++){
            if(arr[i] =='('){
                if(count ==0){
                    count +=1;
                    continue;
                }
                else{
                ans += arr[i];
                count +=1;
                }
            }
            else{
                if(count ==0 || count ==1){
                    count -=1;
                    continue;
                }
                else{
                    ans += arr[i];
                    count -=1;
                }
            }
        }
        return ans;
    }
}