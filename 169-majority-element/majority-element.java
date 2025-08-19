import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        
        for (int num : nums) {
            ht.put(num, ht.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : ht.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }
        
        return -1;
    }
}
