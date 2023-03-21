package Level2;

import java.util.Arrays;

public class level2_011 {
	//카펫
	public static void main(String[] args) {
		//System.out.println(solution(8,1));
		System.out.println(Arrays.toString(solution(18,6)));
	}
	
	public static int[] solution(int brown, int yellow) {
        int[] answer = {};
        answer = new int[2];
        int x = 0, y = 0, sum = 0;
        sum = brown + yellow;
        x = (int) Math.sqrt(sum);
        if(x * x == sum) {
        	answer[0] = x;
        	answer[1] = x;
        } else {
        	x+=1;
        	for(; x * y < sum;) {
        		if(sum % x == 0) {
        			y = sum / x;
        		}
        		
        		if((x-2)*(y-2) == yellow) {
        			answer[0] = x;
        			answer[1] = y;
        		} else {
        			x++;
        			y = 1;
        		}
        	}
        }
        return answer;
	}
}