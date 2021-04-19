package dataStructure;

public class PrimeNumber1 {
	//2부터 시작해서 1000이 될 때까지 1씩 증ㄱㅏ하면서 그 값이 소수인지 판단하는 메서드(일반적인 소수구하기 메서드)
	public static void main(String[] args) {
		int counter = 0;		//나눗셈의 횟수
	
		for(int n = 2; n <= 1000; n++) {
			int i;
			for(i = 2; i < n; i++) {
				counter++;
				if(n % i == 0)	//나누어 떨어지면 소수가 아님
					break;		//더 이상의 반복은 불필요하기 때문에 break
			}
			if(n == i)
				System.out.println(n);
		}
		System.out.println("나눗셈을 수행한 횟수 : " + counter);
	}
}
