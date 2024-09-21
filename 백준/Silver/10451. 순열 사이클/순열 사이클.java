import java.util.*;

public class Main {
	static ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
	static int n,result;
	static int[] num;
	static boolean[] visited;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			n=sc.nextInt();
			result=0;
			num=new int[n+1];
			visited=new boolean[n+1];
			
			for(int i=1;i<=n;i++)
				num[i]=sc.nextInt();
			
			for(int i=1;i<=n;i++) {
				if(!visited[i]) {
					cycle(i);
					result++;
				}
			}
			
			System.out.println(result);
		}
	}
	
	static void cycle(int start) {
		visited[start]=true;
		
		if(!visited[num[start]])
			cycle(num[start]);
	}
}