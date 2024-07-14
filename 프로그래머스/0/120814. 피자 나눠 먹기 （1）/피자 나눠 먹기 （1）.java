class Solution {
    public int solution(int n) {
        int answer = 0;
        int min = n / 7;
        answer = (n % 7 == 0) ? min : (min + 1);
        return answer;
    }
}