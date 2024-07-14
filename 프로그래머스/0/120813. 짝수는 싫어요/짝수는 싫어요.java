import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        List<Integer> oddNumbers = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                oddNumbers.add(i);
            }
        }
        answer = oddNumbers.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}