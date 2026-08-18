class Solution {
    public List<String> generateParenthesis(int n) {
       ArrayList<String> arr = new ArrayList<>();
        int left = n;
        int right = n;
        String str = "";
        answer(arr,left,right,str);
        return arr;


    }

    public void answer(List<String>arr , int left , int right , String str){
    
        if(left ==0 && right ==0){
            arr.add(str);
            return ;
        }
        if(left >0){
            answer (arr,left-1,right,str+"(");
        }
        if(left <right){
            answer(arr,left,right-1,str+")");
        }

        
    }
}