import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int[] height = new int[9];
        int sum = 0;
        int a = 0, b = 0;
        
        for(int i = 0; i < 9; i++) {
            height[i] = s.nextInt();
            sum += height[i];
        }
        
        for(int i = 0; i < 8; i++) {
            for(int j = i+1; j < 9; j++) {
                if(sum - (height[i] + height[j]) == 100) {
                    a = height[i];
                    b = height[j];
                    break;
                }
            }
        }
        
        Arrays.sort(height);
        for(int h : height) {
            if(h != a && h != b) {
                System.out.println(h);
            }
        }
        s.close();
    }
}