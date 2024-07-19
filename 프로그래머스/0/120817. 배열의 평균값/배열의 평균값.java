class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        answer = (numbers[0] + numbers[numbers.length-1]) / 2.0;
        return answer;
    }
}