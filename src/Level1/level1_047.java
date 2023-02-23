package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_047 {
	//푸드 파이트 대회
	public static void main(String[] args) {
		int[] num01 = {1, 3, 4, 6};
		System.out.println(solution(num01));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static String solution(int[] food) {
        String answer = "";
		boolean check = 2 <= food.length && food.length <= 9;
		if(check) {
			answer = "0";
			int k = 0;
			for(int i = food.length - 1; i > 0; i--) {
				if(food[i] % 2 == 0) {
					k = food[i] / 2;
				} else {
					k = (food[i] - 1)/2;
				}
				for(;k > 0; k--) {
					answer = i + answer + i;
				}
			}
		}
        return answer;
	}
}