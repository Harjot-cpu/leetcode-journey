class Solution {
    public int largestInteger(int[] nums, int k) {
        int num = -1;
        if(k == nums.length ){
            for(int i: nums){
                if(i>num){
                    num = i;
                }
            }
            return num;
        }
        if(k == 1){
    for(int i = 0; i < nums.length; i++){
        int count = 0;

        for(int j = 0; j < nums.length; j++){
            if(nums[i] == nums[j]){
                count++;
            }
        }

        if(count == 1 && nums[i] > num){
            num = nums[i];
        }
    }

    return num;
}
        if(k>nums.length){
            return -1;
        }

        int first = nums[0];
        int last = nums[nums.length -1];
        int fcount = 0;
        int lcount = 0;
        for(int i : nums){
            if(i == first){
                fcount +=1;
            }
            if(i == last){
                lcount +=1;
            }
        }

        if(fcount ==1 && lcount ==1){
            num = first;
            if(first<last) num = last;

            return num;
        }
        else{
            if(fcount ==1){
                return first;
            }
            if(lcount ==1){
                return last;
            }
        }
        return -1;
    }
}