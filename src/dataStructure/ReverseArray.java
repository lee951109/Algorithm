package dataStructure;

import java.util.Scanner;

public class ReverseArray {

	static void swap(int[] a, int idx1, int idx2) {
		//배열의 a[idx1]와 a[idx2]를 교환
		int t = a[idx1]; 
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	//배열 a의 요소값을 나타냄
	static void print(int[] a) {
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + ""); //요솟값을 나열해줌
		System.out.println();
	}
	//배열 a의 요소를 역순으로 정렬
	static void reverse(int[] a) {
		print(a);
		for(int i = 0; i < a.length/2; i++) {
			System.out.println("a[" + i + "] 와 a[" +(a.length-i-1) + "]를 교환합니다.");
			swap(a, i , a.length - i -1);
			//a:int[] a, i: idx1, a.length -i -1 : idx2
			print(a);
		}
	}

public static void main(String[] arges) {
	Scanner scn = new Scanner(System.in);
	
	System.out.println("요솟수 : ");
	int num = scn.nextInt();
	
 	int[] x = new int[num]; //요솟수가 num인 배열
	
	for(int i = 0; i < num; i++) {
		System.out.print("x[" + i + "] :");
		x[i] = scn.nextInt();
	}
	
	reverse(x); //배열 a의 요소를 역순으로 정렬
	System.out.println("역순 정렬을 마쳤습니다.");
}

}
