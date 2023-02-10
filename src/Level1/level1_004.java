package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_004 {
	//평균 구하기
	public static void main(String[] args) {
		int[] num01 = {1,2,3,4};
		int[] num02 = {5,5};
		System.out.println(solution(num01));
		System.out.println(solution(num02));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static double solution(int[] arr) {
        double answer = 0;
		boolean check = 1 <= arr.length && arr.length <= 100;
		if(check) {
			int cnt = 0;
			for(int i : arr) {
				answer += i;
				cnt++;
			}
			answer = (double) answer / cnt;
		}
        return answer;
	}
}