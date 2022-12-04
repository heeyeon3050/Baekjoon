package Silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test1182 {
	static int N, S;
	static int arr[];
	static int answer = 0;
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		
		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(0, 0);
		if(S == 0)
			System.out.println(answer-1);
		else
			System.out.println(answer);
	}
	
	public static void dfs(int sum, int cnt) {
		if(cnt == N) {
			if(sum == S) {
				answer++;
			}
			return;
		}
		
		dfs(sum+arr[cnt], cnt+1);
		dfs(sum, cnt+1);
	}
}
