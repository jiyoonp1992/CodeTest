package Level2;

import java.util.Arrays;
import java.util.PriorityQueue;

public class level2_069 {
	//마법의 엘리베이터
	public static void main(String[] args) {
		//System.out.println(solution(16));
		System.out.println(solution(2554));//16
		System.out.println(solution(678));//8
		System.out.println(solution(999));//2
		System.out.println(solution(155));//11
		System.out.println(solution(154));//10
		System.out.println(solution(545));//14
	}
	
	public static int solution(int storey) {
        int answer = 0;
        int x = 0, y = 0, z = 0;
        x = storey;
        while(x != 0) {
        	y = x % 10;
        	x = x / 10;
        	z = x % 10;
        	if(y == 5) {
        		if(z < 5) {
        			answer += 5;
        		} else {
        			x++;
        			answer += 5;
        		}
        	} else if (y < 5) {
        		answer += y;
        	} else {
        		x++;
        		answer += 10 - y;
        	}
        }
		return answer;
	}
}