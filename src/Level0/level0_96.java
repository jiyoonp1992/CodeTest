package Level0;

import java.util.Arrays;

public class level0_96 {
	//연속된 수의 합
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(1,12)));
		System.out.println(Arrays.toString(solution(3,12)));
		System.out.println(Arrays.toString(solution(5,15)));
		System.out.println(Arrays.toString(solution(7,21)));
//		System.out.println(Arrays.toString(solution(5,15)));
		System.out.println(Arrays.toString(solution(4,14)));
//		System.out.println(Arrays.toString(solution(5,5)));
//		System.out.println(Arrays.toString(solution(3,0)));
//		System.out.println(Arrays.toString(solution(1,0)));
//		System.out.println(Arrays.toString(solution(1,100)))
		System.out.println(Arrays.toString(solution(6,9)));
//		System.out.println(Arrays.toString(solution(6,15)));
	}
	
	public static int[] solution(int num, int total) {
        int[] answer = {};
		boolean check = false;
		check = 1 <= num && num <= 100 && 0 <= total && total <= 1000;
		if(check) {
			answer = new int[num];
			int std = 0;
			if(num % 2 == 1) {
				std -= num/2;
				for(int i = 0; i < num;i++) {
					answer[i] = (total/num) + std;
					std++;
				}
			} else {
				std = (total / num) - (num / 2) + 1;
				for(int i = 0; i < num; i++) {
					answer[i] = std;
					std++;
				}
			}
		}
        return answer;
	}
}