package Level0;

import java.util.Arrays;

public class level0_54 {
	//약수 구하기
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(24)));
		System.out.println(Arrays.toString(solution(29)));
		System.out.println(Arrays.toString(solution(25)));
	}
	
	public static int[] solution(int n) {
        int[] answer = {};
		boolean check = false;
		check = 1 <= n && n <= 10000;
		if(check) {
			int cnt = 0;
			int j = (int) Math.sqrt(n);
			for(int i = 1; i <= j; i++) {
				if(n%i == 0) {
					if(i == n/i) {
						answer = Arrays.copyOf(answer, cnt + 1);
						answer[cnt] = i;
						cnt += 1;
					} else {
						answer = Arrays.copyOf(answer, cnt + 2);
						answer[cnt] = i;
						answer[cnt+1] = n/i;
						cnt += 2;
					}
				}
			}
			Arrays.sort(answer);
		}
        return answer;
	}
}