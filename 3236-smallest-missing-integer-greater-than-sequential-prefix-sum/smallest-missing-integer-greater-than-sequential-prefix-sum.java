class Solution {
    public int missingInteger(int[] nums) {
        int len = 1;
        int sum = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(nums[i] - nums[i-1] ==1) {len +=1;
            sum += nums[i];
            }
            else{
                break;
            }
        }

        while (true){
            int match = 1;
            for(int k : nums){
                if(k == sum){
                    match = 0;
                    break;
                }
            }
            if(match ==1){
                break;
            }
            else{
                sum +=1;
            }
        }
        return sum;
    }
}