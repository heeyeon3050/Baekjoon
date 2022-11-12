package Silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class test2581 {
 
	public static boolean prime[];
	
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		prime = new boolean[N + 1];	// �迭 ���� 
		get_prime();
		
		
		// �Ҽ� �� �� �ּڰ� 
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for(int i = M; i <= N; i++) {
			if(prime[i] == false) {	// false = �Ҽ� 
				sum += i;
				if(min == Integer.MAX_VALUE) {	// ù �Ҽ��� �ּڰ���  
					min = i;
				}
			}
		}
		
		if(sum == 0) {	// �Ҽ��� ���ٸ� 
			System.out.println(-1);
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}
		
	}
 
	
	// �����佺�׳׽� ü �˰����� 
	public static void get_prime() {
		prime[0] = true;
		prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;	// �̹� üũ�� �迭�� ��� skip
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
		
	}
}