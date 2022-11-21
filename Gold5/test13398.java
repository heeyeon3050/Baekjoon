package Gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test13398 {
	public static void main(String[] args) throws IOException{
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  StringTokenizer st;
		  int n = Integer.parseInt(br.readLine());
		  int arr[] = new int[n+1];
		  int dp[][] = new int[n+1][2];
		  
		  st = new StringTokenizer(br.readLine());
		  for(int i=1; i<=n; i++) {
			  arr[i] = Integer.parseInt(st.nextToken());
		  }
		  //�ʱ�ȭ ���������
		  //dp[1][1]�� ��, ������ -1�̶�� -1�� �����ϴµ� 0������ ��
		  dp[1][0] = arr[1];
		  dp[1][1] = arr[1];
		  int max = arr[1];
		  for(int i=2; i<=n; i++) {
			  dp[i][0] = Math.max(dp[i-1][0] + arr[i], arr[i]);
			  dp[i][1] = Math.max(dp[i-1][0], dp[i-1][1] + arr[i]); //�ش� ���� ����� �տ��� ������ �ȵǹǷ� ������, �� ����� �տ��� �ϳ� �����ϹǷ� ���� �ִ� ������
			  max = Math.max(max, Math.max(dp[i][0], dp[i][1]));
		  }
		  System.out.println(max);
	}
}
