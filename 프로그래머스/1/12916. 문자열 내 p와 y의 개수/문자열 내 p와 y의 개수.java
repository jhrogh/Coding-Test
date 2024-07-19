class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int countp = 0, county = 0;

        for(char c : s.toCharArray()) {
            if(c == 'p' || c == 'P') countp++;
            else if(c == 'y' || c == 'Y') county++;
        }

        answer = (countp == county) ? true : false;

        return answer;
        
        // 다른 풀이
//         s = s.toLowerCase();
//         int count = 0;

//         for (int i = 0; i < s.length(); i++) {

//             if (s.charAt(i) == 'p')
//                 count++;
//             else if (s.charAt(i) == 'y')
//                 count--;
//         }

//         if (count == 0)
//             return true;
//         else
//             return false;
    
    }
}