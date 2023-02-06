package Level0;

import java.util.Arrays;

public class level0_96 {
	//연속된 수의 합
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(3,12)));
		//System.out.println(Arrays.toString(solution(5,15)));
		//System.out.println(Arrays.toString(solution(4,14)));
		//System.out.println(Arrays.toString(solution(5,5)));
	}
	
	public static int[] solution(int num, int total) {
        int[] answer = {};
		boolean check = false;
		check = 1 <= num && num <= 100 && 0 <= total && total <= 1000;
		if(check) {
			answer = new int[num];
			if(num % 2 == 1) {
				for(int i = 0; i <= num;i++) {
					if(num/2 > i) {
						answer[i] = (total/num)-i-total/num;
					} else if (num/2 == i) {
						answer[i] = total/num;
					}
				}
			}
		}
        return answer;
	}
}