class Solution {        
    public int solution(int n) {
        int answer = 0;
        int lcm;
        lcm = LCM(GCD(n, 6), n);
        answer = lcm / 6;        
        return answer;
    }
    public int GCD(int n, int p) {
        int gcd;
        if(n % p == 0) {
            gcd = p;
            return gcd;
        } else {
            return GCD(p, n % p);
        }
    }
    public int LCM(int gcd, int n) {
        int lcm;
        lcm = (n * 6) / gcd;
        return lcm;
    }
}


// 다른 풀이
// class Solution {
//     public int solution(int n) {
//         int answer = 1;

//         while(true){
//             if(6*answer%n==0) break;
//             answer++;
//         }

//         return answer;
//     }
// }