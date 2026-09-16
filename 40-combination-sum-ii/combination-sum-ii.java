class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();
        checker(candidates, target, 0, new ArrayList<>(), ans);

        return ans;
    }

    public void checker(int[] candidates, int target, int index,
                        ArrayList<Integer> extra,
                        List<List<Integer>> ans) {

        if(target == 0) {
            ans.add(new ArrayList<>(extra));
            return;
        }

        if(target < 0) {
            return;
        }

        for(int i = index; i < candidates.length; i++) {

            if(i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }

            if(candidates[i] > target) {
                break;
            }

            extra.add(candidates[i]);

            checker(candidates, target - candidates[i],
                    i + 1, extra, ans);

            extra.remove(extra.size() - 1);
        }
    }
}