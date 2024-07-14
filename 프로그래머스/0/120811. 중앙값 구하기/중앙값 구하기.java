class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        // 오름차순 정렬 -버블정렬
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = i+1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        // 중앙값 구하기
        int i = array.length / 2;
        answer = array[i];
        
        // 다른 풀이
        // Arrays.sort(array);
        // answer = array[array.length/2];
        
        return answer;
    }
}