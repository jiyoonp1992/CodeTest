package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_035 {
	//예산
	public static void main(String[] args) {
		int[] num01 = {1,3,2,5,4};
		System.out.println(solution(num01, 9));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int[] d, int budget) {
        int answer = 0;
		boolean check = 1 <= d.length && d.length <= 100 && 1 <= budget && budget <= 10000000;
		if(check) {
			Arrays.sort(d);
			for(int i : d) {
				answer = budget - i >= 0? ++answer: answer;
				budget -= i;
			}
		}
        return answer;
	}
}