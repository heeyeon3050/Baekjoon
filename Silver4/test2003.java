package Silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test2003 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		long M = Long.parseLong(st.nextToken());
		int A[] = new int[N];
		long sum = 0;
		int cnt = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		/* �ð� ���⵵ O(N^2)
		for(int i=0; i<N; i++) {
			long sum = 0;
			for(int j=i; j<N; j++) {
				sum += A[j];
				if(sum == M) {
					cnt++;
					break;
				}
				else if(sum > M) {
					break;
				}
			}
		}*/
		
		//�� ������ ���
		int start = 0; int end = 0;
		while(true) {
			if(sum >= M) {
				sum -= A[start++];
			}
			
			else if(end == N) {
				break;
			}
			
			else {
				sum += A[end++];
			}
			if(sum == M)
				cnt++;
		}
		
		System.out.println(cnt);
	}
}