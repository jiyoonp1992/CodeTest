package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_003 {
	//약수의 합
	public static void main(String[] args) {
		System.out.println(solution(12));
		System.out.println(solution(5));
		System.out.println(solution(16));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int n) {
        int answer = 0;
		boolean check = 0 <= n && n <= 3000;
		if(check) {
			if(n == 0) {
				answer = 0;
			} else if (n == 1){
				answer = 1;
			} else {
				for(int i = 1; i<= Math.sqrt(n); i++) {
					answer = n % i == 0 ? (i == Math.sqrt(n))?answer+i:answer+i+n/i:answer; 
				}
			}
		}
        return answer;
	}
}