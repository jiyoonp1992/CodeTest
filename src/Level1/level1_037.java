package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_037 {
	//삼총사
	public static void main(String[] args) {
		int[] num01 = {-2, 3, 0, 2, -5};
		int[] num02 = {-3, -2, -1, 0, 1, 2, 3};
		System.out.println(solution(num01));
		System.out.println(solution(num02));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int[] number) {
        int answer = 0;
		boolean check = 3 <= number.length && number.length <= 13;
		if(check) {
			for(int i = 0; i < number.length-2; i++) {
				for(int j = i + 1; j < number.length-1;j++) {
					for(int k = j + 1; k < number.length;k++) {
						answer = number[i] + number[j] + number[k] == 0 ? ++answer:answer;
					}
				}
			}
		}
        return answer;
	}
}