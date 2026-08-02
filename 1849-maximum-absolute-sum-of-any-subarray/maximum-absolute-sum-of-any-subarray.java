class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int maxending = nums[0];
        int minending = nums[0];
        int finalans = Math.abs(nums[0]);

        for(int i= 1;i<nums.length;i++){

            int v1 = maxending + nums[i];
            int v2 = minending + nums[i];
            int v3 = nums[i];

         maxending = Math.max(v1,v3);
         minending = Math.min(v2,v3);

         finalans = Math.max(finalans,Math.max(Math.abs(maxending), Math.abs(minending)));

         




        }
        return finalans;
        
    }
}