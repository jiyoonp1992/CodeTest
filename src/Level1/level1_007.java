package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_007 {
	//정수 제곱근 판별
	public static void main(String[] args) {
		System.out.println(solution(121));
		System.out.println(solution(3));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static long solution(long n) {
        long answer = 0;
        
        answer = (long) (Math.sqrt(n) % 1 == 0 ? (Math.sqrt(n) + 1) * (Math.sqrt(n) + 1) : -1); 
        return answer;
	}
}