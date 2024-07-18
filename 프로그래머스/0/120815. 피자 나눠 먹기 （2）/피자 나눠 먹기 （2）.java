class Solution {
    public int solution(int n) {
        int answer = 0;
        int lcm;
        
        if(n > 6) {
            lcm = LCM(GCD(n, 6), n);
            answer = lcm / 6;
        }
        else if(6 % n == 0) {
            answer = 1;
        }
        else {
            lcm = LCM(GCD(6, n),n);
            answer = lcm / 6;
        }
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