package Level2;

import java.util.Arrays;

public class level2_060 {
	//124 나라의 숫자
	public static void main(String[] args) {
		for(int i = 1; i <= 40; i++) {
			System.out.println(solution(i));
		}
		//System.out.println(solution(16));
		//solution(7);
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static String solution(int n) {
        String answer = "";
        boolean ch = true;
        int x = 0, y = 0;
        while(ch) {
        	if(y + Math.pow(3, x) >= n + 1) {
        		ch = false;
        	} else {
        		y += Math.pow(3, x);
        		x++;
        	}
        }
        
        for(int i = 1; i <= x-1; i++) {
        	n -= Math.pow(3, i);
        }
        
        for(int j = 1; x >= 1; j++) {
        	if((n <= Math.pow(3, x-1))) {
        		answer += "1";
        	} else if((n > Math.pow(3, x-1) && 2 * Math.pow(3, x-1) >= n)) {
        		answer += "2";
        		n -= Math.pow(3, x-1);
        	} else {
        		answer += "4";
        		n -= 2 * Math.pow(3, x-1);
        	}
        	
        	x--;
        	if(x == 1) {
        		if(n == 1) {
        			answer += "1";
        		} else if(n == 2){
        			answer += "2";
        		} else {
        			answer += "4";
        		}
        		x--;
        	}
        }
        return answer;
	}
}