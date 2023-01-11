package Level0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class level0_36 {
	//자릿수더하기
	public static void main(String[] args) {
		System.out.println(solution(1234));
		System.out.println(solution(930211));
	}
	
	public static int solution(int n) {
        int answer = 0;
		boolean check = false;
		check = 0 <= n && n <= 1000000;
		if(check) {
			for(; n > 0; ) {
				answer += n%10;
				n /= 10;
			}
		}
        return answer;
	}
}