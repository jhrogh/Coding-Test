import java.util.Scanner;

class Solution {
    public int solution(int num1, int num2) {
        int result = 0;
        result = num1 + num2;
        return result;
    }

    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(solution(num1, num2));
    }
}