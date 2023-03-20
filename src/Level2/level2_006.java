package Level2;

import java.util.Arrays;

public class level2_006 {
	//숫자의 표현
	public static void main(String[] args) {
		System.out.println(solution(15));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int n) {
        int answer = 0;
        int cnt = 0, k = 0, sum = 0;
        for(int i = 1; i <= n; i++) {
        	for(int j = i; j <= n; j++) {
        		sum += j;
        		cnt++;
        		if(sum == n) {
        			answer++;
        			k = cnt;
        		} else if (sum > n) {
        			cnt = 0;
        			sum = 0;
        			break;
        		}
        	}
        }
        return answer;
	}
}