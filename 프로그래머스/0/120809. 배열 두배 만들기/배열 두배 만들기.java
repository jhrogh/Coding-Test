class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = numbers;
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
    
    // 다른 풀이
    // public int[] solution(int[] numbers) {
    //     return Arrays.stream(numbers).map(i -> i * 2).toArray();
    // }
}