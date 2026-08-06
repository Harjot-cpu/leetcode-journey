class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;
        for(int i = 1;i<nums.length -1 ;i++){
            int left = -1;
            int right = nums.length ;
            int extra = i-1;
            while(extra >=0){
                if(nums[extra] != nums[i]) break;

                extra -=1;
            }
            left = extra;
            extra = i+1;
            while(extra<= nums.length -1){
                if(nums[extra] != nums[i] ) break;

                extra +=1;
            }
            right = extra;

            if( right != nums.length && left != -1 ){
                if((nums[i] > nums[right] && nums[i] > nums[left]) || (nums[i] <nums[left] && nums[i] < nums[right])){
                    if(nums[i] != nums[i-1]){
                    count +=1;}
                }
            }
        }
        return count;
    }
}