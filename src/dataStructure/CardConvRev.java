package dataStructure;

import java.util.Scanner;

//예제 따라해 보며 이해하기.
public class CardConvRev {
	//정수값 x를 r진수로 변환하여 배열 d에 아랫자이부터 넣어두고 자릿수를 반복한다.
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;					//변환 후의 자릿수
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r);	 //r로 나눈 나머지를 저장
			x /= r;		//x 와 r를 나눈값을 x에 대입. => x/r = x;
		}while(x != 0); //x=0이 될 때까지 반복.
		return digits;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int no;							//변환하는 정수
		int cd;							//기수
		int dno;						//변환 후의 자릿수
		int retry;						//다시 한 번?
		char[] cno = new char[32];		//변환 후 각 자리의 숫자를 넣어두는 문자의 배열 ([32]이인 이유는 z가 32번째이기 때문.)
		
		System.out.println("10진술르 기수 변환합니다.");
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수 :");
				no = scan.nextInt();
			}while(no <= 0); //false시 다음 조건문으로 넘어감
			
			do {
				System.out.print("어떤 진수로 변환할까요? (2~36) : ");
				cd = scan.nextInt();
			}while(cd < 2 || cd > 36);
			
			//dno에는 요솟수가 저장된다?
			dno = cardConvR(no, cd, cno); // =>no = x, cd = r, cno = char[] d
			System.out.print(cd + "진수로는 ");
			for(int i = dno - 1; i >= 0; i--)	//윗 자리부터 차례대로 나타냄
				
				System.out.print(cno[i]);
			System.out.println("입니다.");
			
			System.out.print("한 번 더 할까요? (1.예/0.아니오) : ");
			retry = scan.nextInt();
		}while(retry == 1);
	}
}
