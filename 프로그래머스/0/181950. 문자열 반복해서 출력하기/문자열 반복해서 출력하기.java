import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = sc.nextInt();
        int i = 1;

        if (n < 1 || n >5) {
            System.out.println("조건에 맞지 않음");
        }
        else {
            while(i <= n) {
                System.out.print(str);
                i++;
            }
        }    

        sc.close();
    }
}