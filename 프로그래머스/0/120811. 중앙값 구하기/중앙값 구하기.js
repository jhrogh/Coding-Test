function solution(array) {
    var answer = 0;
    
    for(let i = 0; i < array.length - 1; i++) {
        for(let j = i+1; j < array.length; j++) {
            if(array[i] > array[j]) {
                var temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
    }
    
    let i = Math.floor(array.length / 2);
    answer = array[i];
    
    return answer;
    
    
    // 다른 풀이
    // array.sort((a, b) => a - b)[Math.floor(array.length / 2)]
    
    // 다른 풀이 관련 문법 설명
    // 오름차순 정렬
    // numbers.sort((a, b) => a - b);
    // console.log(numbers); // 출력: [1, 2, 3, 4, 5]

    // 내림차순 정렬
    // numbers.sort((a, b) => b - a);
    // console.log(numbers); // 출력: [5, 4, 3, 2, 1]
}