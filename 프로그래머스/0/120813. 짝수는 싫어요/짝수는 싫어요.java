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
        
        // 다른 풀이
        // List<Integer> answer = new ArrayList<>();
        // for(int i=1; i<=n; i++){
        //     if(i % 2 == 1){
        //         answer.add(i);
        //     }
        // }
        // return answer.stream().mapToInt(x -> x).toArray();
    }
}