class Solution {
    public int majorityElement(int[] nums) {
        int size=nums.length;
        int res=0;
        int x=size/2;
        Arrays.sort(nums);
        for(int i=0;i<x+1;i++)
        {
            res=nums[i];
        }
        return res;
        
        
    }
}