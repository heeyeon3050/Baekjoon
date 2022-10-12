package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test2525 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(br.readLine());
		
		int min = 60*A + B;
		min += C;
		
		int hour = (min/60)%24;
		int minute = min%60;
		
		sb.append(hour).append(" ").append(minute);
		System.out.println(sb);
	}
}
