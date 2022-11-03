package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test2193 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		long dp[] = new long[N+1];
		
		dp[0] = 0;
		dp[1] = 1;
		
		for(int i=2; i<=N; i++) {
			dp[i] = dp[i-1] + dp[i-2];
			//dp[i-1]�� �ڿ� 0�� �� �� �ִ� ����
			//dp[i-2]�� �ڿ� 1�� �� �� �ִ� ����
		}
		
		System.out.println(dp[N]);
	}
}
