package Level2;

import java.util.Arrays;

public class level2_013 {
	//예상 대진표
	public static void main(String[] args) {
		System.out.println(solution(8,4,7));
		//System.out.println(solution(8,1,3));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int n, int a, int b) {
        int answer = 0;
        int x = 0, max = 0, min = 0;
        x = n / 2;
        max = Math.max(a, b);
        min = Math.min(a, b);
        for(; n > 1;) {
        	if(max - min == 1 && max % 2 == 0) {
        		answer++;
        		break;
        	}
        	if(min % 2 == 1) {
    			min = min / 2 + 1;
    		} else {
    			min/=2;
    		}
    		if(max % 2 == 1) {
    			max = max / 2 + 1;
    		} else {
    			max/=2;
    		}
    		answer++;
    		n /= 2;
        }
        return answer;
	}
}