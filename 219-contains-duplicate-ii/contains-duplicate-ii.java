import java.util.*;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Create a HashMap to store number -> last seen index
        Map<Integer, Integer> lastIndex = new HashMap<>();

        // Loop through all elements in nums
        for (int i = 0; i < nums.length; i++) {
            // If we've seen nums[i] before
            if (lastIndex.containsKey(nums[i])) {
                int prevIndex = lastIndex.get(nums[i]); // where it was last seen
                int distance = i - prevIndex; // how far apart

                // If distance <= k, we found a nearby duplicate
                if (distance <= k) {
                    return true; // no need to check further
                }
            }

            // Update the last seen index for nums[i]
            lastIndex.put(nums[i], i);
        }

        // If loop finishes, no nearby duplicates found
        return false;
    }
}
