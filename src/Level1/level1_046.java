package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_046 {
	//콜라 문제
	public static void main(String[] args) {
		//System.out.println(solution(2, 1, 20));
		System.out.println(solution(5, 3, 21));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int a, int b, int n) {
        int answer = 0;
		boolean check = 1 <= b && b < a && a <= n && n <= 1000000;
		if(check) {
			for(;n >= a;) {
				answer += n / a * b;
				n = n % a + (n / a * b);
			}
		}
        return answer;
	}
}