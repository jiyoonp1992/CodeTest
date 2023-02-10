package Level1;

import java.util.Arrays;

public class level1_002 {
	//자릿수 더하기
	public static void main(String[] args) {
		System.out.println(solution(123));
		System.out.println(solution(987));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int n) {
        int answer = 0;
        for(int i = 0; i < n;) {
        	answer += n%10;
        	n = n/10;
        }
        return answer;
	}
}