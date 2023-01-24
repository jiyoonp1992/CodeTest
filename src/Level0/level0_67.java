package Level0;

import java.util.Arrays;

public class level0_67 {
	//진료 순서 정하기
	public static void main(String[] args) {
		int[] num01 = {3, 76, 24};
		int[] num02 = {1, 2, 3, 4, 5, 6, 7};
		int[] num03 = {30, 10, 23, 6, 100};
		System.out.println(Arrays.toString(solution(num01)));
		System.out.println(Arrays.toString(solution(num02)));
		System.out.println(Arrays.toString(solution(num03)));
	}
	
	public static int[] solution(int[] emergency) {
        int[] answer = {};
		boolean check = false;
		check = 1 <= emergency.length && emergency.length <= 10;
		if(check) {
			answer = new int[emergency.length];
			int cnt = 0;
			for(int num1:emergency) {
				int rnk = 1;
				for(int num2:emergency) {
					if(num1 < num2) {
						rnk++;
					}
				}
				answer[cnt] = rnk;
				cnt++;
			}
		}
        return answer;
	}
}