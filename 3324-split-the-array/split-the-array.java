class Solution {
    public boolean isPossibleToSplit(int[] nums) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int val : nums)
        {
            if(map.containsKey(val))
            {
                map.put(val, map.get(val)+1);
            }
            else
            {
                map.put(val,1);
            }
            if(map.get(val)>2)
            {
                return false;
            }
        }
        return true;
        
    }
}