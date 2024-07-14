import java.util.HashMap;
import java.util.Map;
// import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for(int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxFrequency = 0;
        for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int frequency = entry.getValue();
            
            if(frequency > maxFrequency) {
                maxFrequency = frequency;
                answer = entry.getKey();
            }
            else if(frequency == maxFrequency) {
                answer = -1;
            }
        }
        return answer;
    }
}