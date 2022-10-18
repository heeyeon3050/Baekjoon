package Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test10870 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(fibonacci(n));
	}
	
	public static int fibonacci(int num) {
		if(num == 0)
			return 0;
		else if(num == 1)
			return 1;
		
		return fibonacci(num-1) + fibonacci(num-2);
	}
}
