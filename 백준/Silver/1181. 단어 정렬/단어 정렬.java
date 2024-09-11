import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        String[] str = new String[n];
        for(int i = 0; i < n; i++) {
            str[i] = bufferedReader.readLine();
        }

        Arrays.sort(str, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()==o2.length())
                    return o1.compareTo(o2);
                else
                    return o1.length()-o2.length();
            }
        });

        for(int i=0; i<n; i++) {
            if(i!=0) {
                if(str[i].compareTo(str[i-1])!=0)
                    System.out.println(str[i]);
            }
            else
                System.out.println(str[i]);
        }
    }
}