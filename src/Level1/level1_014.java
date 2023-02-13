package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_014 {
	//두 정수 사이의 합
	public static void main(String[] args) {
		System.out.println(solution(3,5));
		System.out.println(solution(5,3));
		System.out.println(solution(3,3));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static long solution(int a, int b) {
        long answer = 0;
        if(a == b) {
        	answer = a;
        } else if (a > b) {
        	for(; a >= b; b++) {
        		answer += b;
        	}
        } else {
        	for(; a <= b; a++) {
        		answer += a;
        	}
        }
        return answer;
	}
}