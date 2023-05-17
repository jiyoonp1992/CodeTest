package Level2;

import java.util.Arrays;

public class level2_049 {
	//2 x n 타일링
	public static void main(String[] args) {
		System.out.println(solution(4));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int n) {
        int answer = 0;
        float x = 0, y = 0, temp = 0;
        for(int i = 1; i <= n; i++) {
        	if(i == 1) {
        		x = 1;
        	} else if ( i == 2) {
        		y = 2;
        	} else {
        		temp = x % 1000000007;
        		x = y % 1000000007;
        		y = temp + y;
        	}
        	answer = (int) (x + y) ;
        }
        return answer;
	}
}