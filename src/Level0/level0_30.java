package Level0;

import java.util.Arrays;

public class level0_30 {
	//짝수는 싫어요
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(10)));
		System.out.println(Arrays.toString(solution(15)));
	}
	
	public static int[] solution(int n) {
        int[] answer = {};
		boolean check = false;
		check = 1 <= n && n <= 100;
		if(check) {
			int cnt = 0;
			cnt = (n%2 == 0) ? n/2 : n/2 + 1;
			answer = new int[cnt];
			int j = 0;
			for(int i = 1 ; i <= n ; i++) {
				if(i%2 != 0) {
					answer[j] = i;
					j++;
					}
				}
			}
        return answer;
	}
}