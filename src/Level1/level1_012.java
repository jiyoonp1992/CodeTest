package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_012 {
	//하샤드 수
	public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(12));
		System.out.println(solution(11));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static boolean solution(int x) {
        boolean answer = true;
		boolean check = 1 <= x && x <= 10000;
		int sum = 0, y = 0;
		if(check) {
			y= x;
			for(;x > 0;) {
				sum += x % 10;
				x /= 10;
			}
			
			if(y % sum != 0) {
				answer = false;
			}
		}
        return answer;
	}
}