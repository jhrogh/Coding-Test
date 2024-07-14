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
}