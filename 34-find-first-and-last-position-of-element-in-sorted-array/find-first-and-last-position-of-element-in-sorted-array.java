class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int f=-1;
        int l=-1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==target)
            {
                if(f==-1)
                {
                    f=i;
                }
                l=i;
                
            }
            
        }
        return new int[]{f,l};
    }
}