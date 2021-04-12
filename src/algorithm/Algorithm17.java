package algorithm;

import java.util.Scanner;

public class Algorithm17 {
	//n단의 숫자 피라미드 출력학
	static void npira(int n) {
		for(int  i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i; j++)
				System.out.print(' ');
			for(int j = 1; j <= (i-1)*2+1; j++)
				System.out.print(i % 10);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n;
		
		System.out.println("숫자형 피라미드 만들기");
		System.out.println("단수는 : ");
		n = scn.nextInt();
		
		System.out.println("숫자가 증가하는 피라미드");
		npira(n);
	}
}
