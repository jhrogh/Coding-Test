class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int[] test = new int[2];
        int a = denom1;
        int b = denom2;
        
        // 최대공약수 구하기
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        int gcd = a;
        
        // 최소공배수 구하기 -> 분모
        int lcm = (denom1 * denom2) / gcd;
        test[1] = lcm;
        
        // 분자구하기
        int x1 = lcm / denom1;
        int x2 = lcm / denom2;
        
        int numerator = (numer1 * x1) + (numer2 * x2);
        test[0] = numerator;
        
        // 기약분수
        while(numerator != 0) {
            int temp = lcm % numerator;
            lcm = numerator;
            numerator = temp;
        }
        int gcd2 = lcm;
        
        answer[0] = test[0] / gcd2;
        answer[1] = test[1] / gcd2;
        
        return answer;
    }
    
    // 다른 풀이
//         public int[] solution(int denum1, int num1, int denum2, int num2) {
//         int[] answer = new int[2];

//         answer[0]=denum1*num2+denum2*num1;
//         answer[1]=num1*num2;
//         int min = Math.min(answer[0],answer[1]);
//         int max = 1;
//         for(int i=1; i<=min; i++){
//             if(answer[0]%i==0 && answer[1]%i==0){
//                 max= i;
//             }
//         }
//         answer[0] /= max;
//         answer[1] /= max;
//         return answer;
//     }
}