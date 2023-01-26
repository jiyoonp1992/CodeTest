package Level0;

import java.util.Arrays;

public class level0_73 {
	//소인수분해
	public static void main(String[] args) {
		//System.out.println(Arrays.toString(solution(10)));
		//System.out.println(Arrays.toString(solution(17)));
		//System.out.println(Arrays.toString(solution(420)));
		for(int i = 2; i <= 500; i++) {
			System.out.println(i + " = " + Arrays.toString(solution(i)));
		}
	}
	
	public static int[] solution(int n) {
        int[] answer = {};
		boolean check = false;
		check = 2 <= n && n <= 10000;
		if(check) {
			int cnt = 0;
			for(int i = 2; i <= n; i++) {
				if(n%i == 0) {
					for(;n%i == 0;) {
						n /= i;
					};
					answer = Arrays.copyOf(answer, answer.length+1);
					answer[cnt] = i;
					cnt++;
				}
			}
		}
        return answer;
	}
}