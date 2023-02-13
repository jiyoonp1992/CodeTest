package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_015 {
	//콜라츠 추측
	public static void main(String[] args) {
		System.out.println(solution(6));
		System.out.println(solution(16));
		System.out.println(solution(626331));
		System.out.println(solution(1));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int num) {
        int answer = 0;
		boolean check = 1 <= num && num < 8000000;
		if(check) {
			if(num == 1) {
				answer = 0;
			} else {
				long lNum = num;
				for(; lNum > 1; answer++) {
					if(lNum % 2 == 0) {
						lNum /= 2;
					} else {
						lNum = lNum * 3 + 1;
					}
					
					if(answer >= 500) {
						answer = -1;
						break;
					}
				}
			}
		}
        return answer;
	}
}