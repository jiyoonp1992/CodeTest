package Level0;

import java.util.Arrays;

public class level0_62 {
	//팩토리얼
	public static void main(String[] args) {
		for(int j = 40320; j <= 362880; j++) {
			System.out.println(j + " = " + solution(j));
		}
//		System.out.println(solution(1));
//		System.out.println(solution(2));
//		System.out.println(solution(6));
//		System.out.println(solution(24));
//		System.out.println(solution(120));
//		System.out.println(solution(720));
//		System.out.println(solution(5040));
//		System.out.println(solution(40320));
//		System.out.println(solution(362880));
//		System.out.println(solution(3628800));
	}
	
	public static int solution(int n) {
        int answer = 0;
		boolean check = false;
		check = 0 < n && n <= 3628800;
		if(check) {
			for(int i = 1; i <= 11; i++) {
				if(n/i <= i || n/i == 1) {
					answer = i;
					break;
				}
				n /= i;
			}
		}
        return answer;
	}
}