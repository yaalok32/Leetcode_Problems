class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i =0;i<nums.length;i++){
            sum = sum+nums[i];

        }

         if(sum - nums[0]==0) // checking if pivot index at 0 or not;
        {
            return 0;
        }  
        
        int left = 0;
        for(int i =1;i<nums.length;i++)
        {
            left = left + nums[i-1];
             int right = sum - left - nums[i];
            if(left==right)
            {
                return i;
            }   
            
        } 
        
        return -1;
        
        }
}
