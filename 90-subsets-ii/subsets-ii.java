class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        LinkedHashSet<ArrayList<Integer>> ans = new LinkedHashSet<>();
        fn(0,nums,ans,new ArrayList<Integer>());
    return new ArrayList<>(ans);

    }
    public void fn(int index, int[] nums ,LinkedHashSet<ArrayList<Integer>> ans ,ArrayList<Integer> arr){
        if(index == nums.length){
          ans.add(new ArrayList<Integer>(arr));
            return ;
        }
        arr.add(nums[index]);
        fn(index+1,nums,ans,arr);
        arr.remove(arr.size()-1);
        fn(index+1,nums,ans,arr);
    }
}