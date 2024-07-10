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



// 다른 풀이
// function fnGCD(a, b){
//     return (a%b)? fnGCD(b, a%b) : b;
// }

// function solution(denum1, num1, denum2, num2) {
//     let denum = denum1*num2 + denum2*num1;
//     let num = num1 * num2;
//     let gcd = fnGCD(denum, num); //최대공약수

//     return [denum/gcd, num/gcd];
// }