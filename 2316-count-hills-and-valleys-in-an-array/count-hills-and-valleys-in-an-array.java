class Solution {
    public int countHillValley(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                arr.add(nums[i]);
            } else {
                if (nums[i] != nums[i - 1]) {
                    arr.add(nums[i]);
                }
            }
        }

        int count = 0;

        for (int i = 1; i < arr.size() - 1; i++) {
            if (arr.get(i) > arr.get(i - 1) && arr.get(i) > arr.get(i + 1)) {
                count++;
            }

            if (arr.get(i) < arr.get(i - 1) && arr.get(i) < arr.get(i + 1)) {
                count++;
            }
        }

        return count;
    }
}