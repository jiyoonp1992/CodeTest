package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_011 {
	//나머지가 1이 되는 수 찾기
	public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(12));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int n) {
        int answer = 0;
        for(int i = 2 ; i <= Math.sqrt(n - 1);i++) {
        	if((n-1) % i == 0) {
        		answer = i;
        		break;
        	} else {
        		answer = n - 1;
        	}
        }
        return answer;
	}
}