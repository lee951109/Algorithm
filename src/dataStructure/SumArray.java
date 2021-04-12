package dataStructure;

import java.util.Scanner;

public class SumArray {

//내가 풀어본 답.
	
	static int sumOf(int[] a) {
		//요소의 합 구하기!
		int result = 0;
		for(int i = 0; i < a.length; i++)
			result += a[i];
		return result;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num = scn.nextInt(); // 요솟수
		
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = scn.nextInt();
		}
		System.out.println("전 요소의 합계는 " + sumOf(x) + "입니다.");	
	}
}