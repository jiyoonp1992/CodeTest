package cote;

public class _02 {

	public static void main(String[] args) {
		//양의 정수의 배열 arr이 주어질 때 모든 원소들이 둘 씩 짝지어 생기는 최소공배수를 합한 값을 리턴하는 solution 함수를 작성해주세요.
		
		//- arr 내 원소들은 중복되지 않습니다.
		//- arr 배열의 길이는 최소 3입니다.
		//- 입출력 예 : [ 1 , 2 , 3 ] → ( {1 | 2} → 2 + { 1 | 3 } → 3 + { 2 | 3 } → 6 ) = 11
		int answer = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length; j++) {
				answer += (arr[i] * arr[j]) / gcd(arr[i],arr[j]);
			}
		}
		return answer;
	}
	
	public static int gcd(int a, int b) {
		int x = 0, y = 0, z = 0;
		x = a;
		y = b;
		while(y != 0) {
			z = x % y;
			x = y;
			y = z;
		}
		
		return  x;
	}

}
