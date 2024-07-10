function solution(numer1, denom1, numer2, denom2) {
    var answer = [];
    var numer = (numer1 * denom2) + (numer2 * denom1);
    var denom = denom1 * denom2;
    
    var min = (numer < denom) ? numer : denom;
    var max = 1;
    for(let i = 1; i <= min; i++) {
        if(numer % i == 0 && denom % i == 0) {
            max = i;
        }
    }
    
    answer[0] = numer / max;
    answer[1] = denom / max;
    
    return answer;
}