class Solution {
    public boolean uniformArray(int[] nums1) {
        int so = Integer.MAX_VALUE;
        int se = Integer.MAX_VALUE;
        int oddcount = 0;
        for(int i = 0;i<nums1.length;i++){
                if(nums1[i]%2==0){
                    if( se > nums1[i]){
                        se = nums1[i];
                    }
                }
                else{
                    oddcount +=1;
                    if(so> nums1[i]){
                        so = nums1[i];
                    }
                }
        }

        if(oddcount ==0){
            return true;
        }
        if(oddcount !=0){
            if(so <se){
                return true;
            }
            else{
                return false;
            }
        }
        return true;
    }
}