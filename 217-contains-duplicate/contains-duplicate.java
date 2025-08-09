import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {  // Loop through all elements
            if (map.containsKey(nums[i])) {     // Step 1: Check if this number is already in the map
                return true;                    // If yes → it's a duplicate, return true
            }
            map.put(nums[i], 1);                 // Step 2: Otherwise, store it in the map
        }
        return false; // No duplicates found
    }
}
