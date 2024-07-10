function solution(numbers) {
    var answer = [];
    for(let i = 0; i < numbers.length; i++) {
        answer[i] = numbers[i] * 2;
    }
    return answer;
}

// 다른 풀이
// function solution(numbers) {
//     var answer = [];
//     return numbers.map(number => number * 2);
// }