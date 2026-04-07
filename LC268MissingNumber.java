class Solution {
    public int missingNumber(int[] nums) 
    {
        /*int max = nums[0];
        int min = nums[0];
        for(int num : nums)
        {
            if(num > max) max = num;
            if(num < min) min = num;
        }
        
        for(int i = 0; i <= max; i++){
            boolean found = false;
            for(int num : nums)
            {
                if(num == i)
                {
                    found = true;
                    break;
                }
            }
            if(!found) return i;
        }
        
        return max + 1;BruteForce*/
        int res=nums.length;//optimal Solution
        for(int i=0;i<nums.length;i++)
        {
            res+=i-nums[i];
        }
        return res;
        
    }
}
