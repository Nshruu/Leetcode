class Solution {
    public int[] sortedSquares(int[] nums) {

        ArrayList<Integer> ni = new ArrayList<>();
        ArrayList<Integer> po = new ArrayList<>();

        // Separate negative and positive numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                ni.add(nums[i]);
            } else {
                po.add(nums[i]);
            }
        }

        // Result array
        int[] ans = new int[nums.length];

        // Start from the last negative element
        int i = ni.size() - 1;

        // Start from the first positive element
        int j = 0;

        int k = 0;

        // Merge
        while (i >= 0 && j < po.size()) {

            int left = ni.get(i) * ni.get(i);
            int right = po.get(j) * po.get(j);

            if (left < right) {
                ans[k++] = left;
                i--;
            } else {
                ans[k++] = right;
                j++;
            }
        }

        // Remaining negatives
        while (i >= 0) {
            ans[k++] = ni.get(i) * ni.get(i);
            i--;
        }

        // Remaining positives
        while (j < po.size()) {
            ans[k++] = po.get(j) * po.get(j);
            j++;
        }

        return ans;
    }
}