import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int n = nums.length;
        int half = n / 2;
        HashSet<Integer> uniqueTypes = new HashSet<>();
        
        for (int num : nums) {
            uniqueTypes.add(num);
        }
        
        return Math.min(uniqueTypes.size(), half);
    }
}
