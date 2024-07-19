import java.util.*;

class Solution {
    public int[] solution(long n) {
//         String str = Long.toString(n); // 숫자 -> 문자열
//         int[] answer = new int[str.length()];

//         for(int i = 0; i < str.length(); i++) {
//             answer[i] = Character.getNumericValue(str.charAt(str.length() - 1 - i));
//         }
        String str = Long.toString(n); // 숫자 -> 문자열
        int[] answer = new int[str.length()];        
        int i = 0;

        while(n > 0) {
            answer[i] = (int) (n % 10);
            n /= 10;
            i++;
        }
        
        return answer;
    }
}