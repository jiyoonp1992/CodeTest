package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_055 {
	//과일 장수
	public static void main(String[] args) {
		int[] num01 = {1, 2, 3, 1, 2, 3, 1};
		int[] num02 = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
		System.out.println(solution(3,4,num01));
		System.out.println(solution(4,3,num02));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int k, int m, int[] score) {
        int answer = 0;
		boolean check = 3 <= k && k <= 9 && 3 <= m && m <= 10 && 7 <= score.length && score.length <= 1000000;
		if(check) {
			Arrays.sort(score);
			int min = 10;
			for(int i = 0; i < score.length; i++) {
				min = Math.min(min, score[score.length - 1 - i]);
				if((i + 1) % m == 0) {
					answer += min * m;
					min = 10;
				}
			}
		}
        return answer;
	}
}

//for(int i = 0; i < score.length; i++) {
//	min = 10;
//	for(int i = 0; i < m; i++) {
//		min = Math.min(min, score[score.length - 1 - i]);
//	}
//	score = Arrays.copyOfRange(score, 0, score.length - m);
//	answer += min * m;
//}