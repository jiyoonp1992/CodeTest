package Level0;

import java.util.Arrays;

public class level0_79 {
	//삼각형의 완성조건 (2)
	public static void main(String[] args) {
		int[] num01 = {1,2};
		int[] num02 = {3,6};
		int[] num03 = {11, 7};
		System.out.println(solution(num01));
		System.out.println(solution(num02));
		System.out.println(solution(num03));
	}
	
	public static int solution(int[] sides) {
        int answer = 0;
		boolean check = false;
		check = sides.length == 2;
		if(check) {
			int max = 0, min = 0;
			max = Math.max(sides[0], sides[1]);
			min = Math.min(sides[0], sides[1]);
			for(int i = 1; i <= max; i++) {
				answer = (min+i > max) ? ++answer : answer;
			}
			for(int j = max+min; j > max; j--) {
				answer = (max+min > j) ? ++answer : answer;
			}
		}
        return answer;
	}
}