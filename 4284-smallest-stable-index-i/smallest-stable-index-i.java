class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int score;
        for(int i = 0;i<nums.length;i++){
            int first = findmax(nums,0,i);
            int scnd = findmin(nums,i,nums.length);
            int sum = first-scnd;
            if(sum<=k) return i;
        }

        return -1;
    }

    int findmin(int[] nums, int start , int end){
        int min = Integer.MAX_VALUE;
        for(int i = start;i<end;i++){
            if(nums[i]<min) min = nums[i];
        }
        return min;
    }

    int findmax(int[] nums,int start,int end){
        int max = Integer.MIN_VALUE;
        for(int i = start;i<=end;i++){
            if (max <nums[i]) max = nums[i];
        }
        return max;
    }
}