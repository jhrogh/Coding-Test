function solution(array) {
    var answer = 0;
     const frequencyMap = new Map();

    // 배열을 순회하면서 각 숫자의 등장 횟수를 저장
    for (let num of array) {
        frequencyMap.set(num, (frequencyMap.get(num) || 0) + 1);
    }

    let maxFrequency = 0;
    for (let [num, frequency] of frequencyMap.entries()) {
        if (frequency > maxFrequency) {
            maxFrequency = frequency;
            answer = num;
        } else if (frequency === maxFrequency) {
            answer = -1;
        }
    }
    return answer;
}