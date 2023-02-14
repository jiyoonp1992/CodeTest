package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_021 {
	//없는 숫자 더하기
	public static void main(String[] args) {
		int[] num01 = {1,2,3,4,6,7,8,0};
		int[] num02 = {5,8,4,0,6,7,9};
		System.out.println(solution(num01));
		System.out.println(solution(num02));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int[] numbers) {
        int answer = 0;
		boolean check = 1 <= numbers.length && numbers.length <= 9;
		if(check) {
			boolean numCh = false;
			for(int i = 0; i <= 9; i++) {
				for(int j = 0; j < numbers.length; j++) {
					if(i == numbers[j]) {
						numCh = false;
						break;
					} else {
						numCh = true;
					}
				}
				
				if(numCh) {
					answer += i;
				}
			}
		}
        return answer;
	}
}