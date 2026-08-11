import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        checker(candidates, target, 0, new ArrayList<Integer>(), ans);

        return ans;
    }


    public void checker(int[] arr, int target, int index,
                        ArrayList<Integer> extra,
                        List<List<Integer>> ans) {

        if(target == 0) {
            ans.add(new ArrayList<>(extra));
            return;
        }

        if(target < 0 || index == arr.length) {
            return;
        }


     
        extra.add(arr[index]);

        checker(arr, target - arr[index], index, extra, ans);
    extra.remove(extra.size() - 1);


        checker(arr, target, index + 1, extra, ans);
    }
}