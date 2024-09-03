
import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s2 + s1).compareTo(s1 + s2);
            }
        });

        StringBuilder result = new StringBuilder();
        for (String s : arr) {
            result.append(s);
        }
        if (result.charAt(0) == '0') {
            return "0";
        }

        String answer = result.toString();
        
        return answer;
    }
}