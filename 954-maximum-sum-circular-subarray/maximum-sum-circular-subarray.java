class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int totalSum = nums[0];

        int maxending = nums[0];
        int minending = nums[0];

        int maxans = nums[0];
        int minans = nums[0];

        for (int i = 1; i < nums.length; i++) {

            totalSum += nums[i];

            int v1 = maxending + nums[i];
            int v2 = minending + nums[i];
            int v3 = nums[i];

            maxending = Math.max(v1, v3);
            minending = Math.min(v2, v3);

            maxans = Math.max(maxans, maxending);
            minans = Math.min(minans, minending);
        }

        if (maxans < 0) {
            return maxans;
        }

        return Math.max(maxans, totalSum - minans);
    }
}