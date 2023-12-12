package cote;

public class _03 {

	public static void main(String[] args) {
		//양의 정수인 a값이 주어질 때 1부터 a값 이하에 존재하는 모든 소수의 합을 리턴하는
		//solution 함수를 작성해주세요.
		
		//- 소수란 1과 자기 자신으로만 나눠지는 수 입니다. ( 1인 소수가 아닙니다. )
		//- a는 최소 4부터 주어집니다.
		
		
		//a : 5 → 10
		//a : 10 → 17
		//a : 30 → 129
		int b = 0, answer = 0;
		int a = 5;
		for(int i = 2; i <= a; i++) {
			b = (int) Math.sqrt(i) + 1;
			for(int j = 2; j <= b; j++) {
				System.out.println("i = " + i);
				System.out.println("j = " + j);
				System.out.println("a = " + a);
				System.out.println("b = " + b);
				if(i % j == 0 && j == b) {
					answer += j;
				}
				System.out.println("answer = " + answer);
			}
			
		}
		System.out.println(answer);
	}
}