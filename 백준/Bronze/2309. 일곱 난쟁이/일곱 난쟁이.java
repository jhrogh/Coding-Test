import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();
        int[] height = new int[9];
        int sum = 0;
        int remove1 = 0, remove2 = 0;

        for(int i = 0; i < 9; i++) {
            height[i] = Integer.parseInt(bufferedReader.readLine());
            sum += height[i];
        }

        sum -= 100;
        for(int i = 0; i < 9; i++) {
            int target = sum - height[i];
            if(set.contains(target)) {
                remove1 = height[i];
                remove2 = target;
                break;
            }
            set.add(height[i]);
        }

        Arrays.sort(height);
        for (int n : height) {
            if (n != remove1 && n != remove2) {
                System.out.println(n);
            }
        }
    }
}