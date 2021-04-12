package dataStructure;

import java.util.Scanner;

public class CopyArray {

	static void copy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length : b.length;
			//true면 num = a.lenght, false면 num = b.length
		for (int i = 0; i < num; i++)
			a[i] = b[i]; //a[i]에 b[i]를 대입.
	}
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	System.out.println("a요소값 : " );
	int anum = scn.nextInt();
	
	int[] a = new int[anum];
	
	for(int i = 0; i < anum; i++) {
		System.out.println("a[" + i + "] : ");
		a[i] = scn.nextInt();
	}
	
	System.out.println("b요소값 : " );
	int bnum = scn.nextInt();
	
	int[] b = new int[bnum];
	
	for(int i = 0; i < bnum; i++) {
		System.out.println("b[" + i + "] : ");
		b[i] = scn.nextInt();
	}
	copy(a, b); // 배열 b의 모든 요소를 배열 a에 복사

	System.out.println("배열 b의 모든 요소를 배열 a에 복사했습니다.");
	for (int i = 0; i < anum; i++)
		System.out.println("a[" + i + "] = " + a[i]);
}
}
