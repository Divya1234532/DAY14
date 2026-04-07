class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int n=nums.length;
        /*for(int i:nums)
        {
             set.add(i);
        }
        return set.size()!=n;*/
        for(int i:nums)
        {
            if(!set.add(i))
            {
                return true;
            }
            set.add(i);
        }
        return false;
        
        
    }
}
