package Level0;

import java.util.Arrays;

public class level0_41 {
	//n의 배수 고르기
	public static void main(String[] args) {
		int[] num01 = {4, 5, 6, 7, 8, 9, 10, 11, 12};
		int[] num02 = {1, 9, 3, 10, 13, 5};
		int[] num03 = {2, 100, 120, 600, 12, 12};
		System.out.println(solution(3, num01));
		//System.out.println(solution(5, num02));
		//System.out.println(solution(12, num03));
	}
	
	public static int[] solution(int n, int[] numlist) {
        int[] answer = {};
        int cnt = 0;
		boolean check = false;
		check = 1 <= n && n <= 10000 && 1 <= numlist.length && numlist.length <= 100;
		if(check) {
			for(int i : numlist) {
				if(1 <= i && i <= 100000 && (i%n) == 0) {
					answer = Arrays.copyOf(answer, cnt+1);
					answer[cnt] = i;
					cnt++;
				}
			}
			
		}
        return answer;
	}
}