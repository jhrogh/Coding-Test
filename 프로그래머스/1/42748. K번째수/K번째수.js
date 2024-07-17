function solution(array, commands) {
    var answer = [];

    for (let command of commands) {
        let i = command[0];
        let j = command[1];
        let k = command[2];
        
        let result = array.slice(i - 1, j);
        result.sort((a, b) => a - b);
        answer.push(result[k - 1]);
    }

    return answer;
}