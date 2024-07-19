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
    }
}