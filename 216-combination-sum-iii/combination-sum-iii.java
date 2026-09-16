class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> extra = new ArrayList<>();

        fn(k, n, ans, 1, extra);

        return ans;
    }

    public void fn(int k, int n,List<List<Integer>> ans, int start, ArrayList<Integer> extra) {

        if (n == 0) {
            if (extra.size() == k) {
                ans.add(new ArrayList<>(extra));
            }
            return;
        }

        if (start > 9 || extra.size() == k) {
            return;
        }
        extra.add(start);
        fn(k, n - start, ans, start + 1, extra);
        extra.remove(extra.size() - 1);
        fn(k, n, ans, start + 1, extra);
    }
}