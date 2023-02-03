package Level0;

import java.util.Arrays;

public class level0_86 {
	//유한소수 판별하기
	public static void main(String[] args) {
		//System.out.println(solution(7,20));
		//System.out.println(solution(11,22));
		//System.out.println(solution(12,21));
		//System.out.println(solution(1,30));
		//System.out.println(solution(1000, 1000));
		System.out.println(solution(12, 36));
	}
	
	public static int solution(int a, int b) {
        int answer = 0;
		boolean check = false;
		check = 0 < a && a <= 1000 && 0 < b && b <= 1000;
		if(check) {
			for(int i = a; i >= 2;) {
				if(a%i == 0 && b%i == 0) {
					a /= i;
					b /= i;
				} else {
					i--;
				}
			}
			if(b == 1) {
				answer = 1;
			} else {
				for(int j = 2; j <= b;) {
					if(b%j == 0) {
						if(j == 2 || j == 5) {
							answer = 1;
						} else {
							answer = 2;
							break;
						}
						b /= j;
					} else {
						j++;
					}
				}
			}
		}
        return answer;
	}
}