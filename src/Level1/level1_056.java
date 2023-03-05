package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_056 {
	//명예의 전당 (1)
	public static void main(String[] args) {
		int[] num01 = {10, 100, 20, 150, 1, 100, 200};
		int[] num02 = {10, 30, 40, 3, 0, 20, 4};
		//System.out.println(solution(3, num01));
		//System.out.println(Arrays.toString(solution(100, num01)));
		System.out.println(Arrays.toString(solution(9, num02)));
		//10, 10, 10, 3, 0, 0, 0
	}
	
	public static int[] solution(int k, int[] score) {
        int[] answer = {};
		boolean check = 3 <= k && k <= 100 && 7 <= score.length && score.length <= 1000;
		if(check) {
			answer = new int[score.length];
			int[] numArr = new int[k];
			int cnt = 0;
			for(int num : score) {
				if(cnt == 0) {
					Arrays.fill(numArr, num);
				} else {
					if(num > numArr[0]) {
						numArr[0] = num;
					} else {
						if(cnt < score.length) {
							numArr[0] = num;
						}
					}
				}
				System.out.println(num);
				System.out.println(cnt);
				Arrays.sort(numArr);
				System.out.println(Arrays.toString(numArr));
				answer[cnt] = numArr[0];
				cnt++;
			}
		}
        return answer;
	}
}