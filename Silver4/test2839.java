package Silver4;

import java.util.Scanner;

public class test2839 {

	public static void main(String[] args) {
		System.out.println("����ҷ��� ������ ���� : ");
		Scanner s = new Scanner(System.in);
		int weight = s.nextInt();
		int num;
		int i, j, a, min=weight;
		int max = weight/3;
		for(i=0; i<=max; i++) {
			for(j=0; j<=max; j++) {
				num = 3*i + 5*j;
				if(num == weight) {
					a = i+j;
					if(a<min)
						min = a;
				}
			}
		}
		if(min == weight)
			min = -1;
		System.out.println("����ϴ� ������ �ּ� ���� : " + min);
	}
}


