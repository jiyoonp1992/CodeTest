package Level2;

import java.util.Arrays;

public class level2_049 {
	//2 x n 타일링
	public static void main(String[] args) {
		for(int i = 1; i <= 500; i++) {
			System.out.println(solution(i));
		}
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int n) {
        int answer = 0;
        int x = 0, y = 0;
        if(n == 1) {
        	answer = 1;
        } else if (n == 2) {
        	answer = 2;
        } else {
        	x = 1;
        	y = 2;
        	for(int i = 3; i <= n; i++) {
        		answer = (x + y) % 1000000007;
        		x = y;
        		y = answer;
        	}
        }
        return answer;
	}
}