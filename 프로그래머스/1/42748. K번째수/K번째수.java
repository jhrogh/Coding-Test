import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int i, j, k;
        int index = 0;
        
        for(int[] command : commands) {
            i = command[0];
            j = command[1];
            k = command[2];
            int[] result = Arrays.copyOfRange(array, i - 1, j);
            Arrays.sort(result);
            answer[index] = result[k-1];
            index++;
        }
        
        return answer;
    }
}