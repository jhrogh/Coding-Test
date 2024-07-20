import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        List<Integer> list = new ArrayList<>();
        while(n > 0) {
            list.add((int)(n % 10));
            n /= 10;
        }

        for(int i = 0; i < list.size() -1 ; i++) {
            for(int j = 0; j < list.size() - 1 - i; j++) {
                if(list.get(j) < list.get(j+1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(int num : list) {
            stringBuilder.append(num);
        }
        String str = stringBuilder.toString();
        answer = Long.parseLong(str);
        
        return answer;
        
        // 다른 풀이
//         String[] list = String.valueOf(n).split("");
//         Arrays.sort(list);

//         StringBuilder sb = new StringBuilder();
//         for (String aList : list) sb.append(aList);

//         answer = Long.parseLong(sb.reverse().toString());
//         return answer;
    }
}