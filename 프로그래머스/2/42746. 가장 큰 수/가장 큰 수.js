function solution(numbers) {
    let arr = numbers.map(String);

    arr.sort((a, b) => (b + a) - (a + b));

    let answer = arr.join('');

    if (answer[0] === '0') {
        return '0';
    }
    return answer;
}