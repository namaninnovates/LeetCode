class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int tot=0;
        for(int x=0;x<n;x++)
        {
            tot=tot+nums[x];
        }
        int leftSum=0;
        for(int i=0;i<n;i++)
        {
            int rightSum=tot-leftSum-nums[i];
            if(leftSum==rightSum)
            {
                return i;
            }
            leftSum=leftSum+nums[i];
        }
        return -1;
    }
}