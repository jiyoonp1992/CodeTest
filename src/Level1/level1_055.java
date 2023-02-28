package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_055 {
	//과일 장수
	public static void main(String[] args) {
		//System.out.println(solution());
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int k, int m, int[] score) {
        int answer = 0;
		boolean check = 3 <= k && k <= 9 && 3 <= m && m <= 10 && 7 <= score.length && score.length <= 1000000;
		if(check) {
			Arrays.sort(score);
			int[] arr = {0, 0, 0};
			while(score.length < 3) {
				
			}
		}
        return answer;
	}
}