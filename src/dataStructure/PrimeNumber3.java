package dataStructure;

public class PrimeNumber3 {
	//n의 제곱근 이하의 소수로 나누는 방법
	public static void main(String[] args) {
		int counter = 0;				//나눗셈의 횟수
		int ptr = 0;					//찾은 소수의 갯수
		int[] prime = new int[500];		//소수를 저장하는 배열
		
		prime[ptr++] = 2;				//prime[0] = 2는 소수임
		prime[ptr++] = 3;				//prime[1] = 3은 소수임
		
		for(int n = 5; n <= 1000; n += 2) {//대상은 홀수만
			boolean flag = false;	//flag는 n이 n의 제곱근 이하의 수로 나누어 떨어지면 true, 그렇지 않다면 false를 저장하는 변수
			for(int i = 1; prime[i] * prime[i] <= n; i++) {
				counter += 2;
				if(n % prime[i] == 0) {		//나누어떨어지면 소수가 아님
					flag = true;
					break;					//더 이상의 반복은 불필요
				}
			}
			if(!flag) {						//마지막까지 나누어떨어지지 않으면
				prime[ptr++] = n;			//소수라고 배열에 저장
				counter++;
			}
		}
		for(int i = 0; i < ptr; i++)		//찾은 ptr개의 소수를 출력
			System.out.println("prime[" + i + "]" + prime[i]);
		
		System.out.println("곱셈과 나눗셈을 한 횟수 : " + counter);
	}
}
