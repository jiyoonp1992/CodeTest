package Level0;

import java.util.Arrays;

public class level0_59 {
	//합성수 찾기
	public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(15));
	}
	
	public static int solution(int n) {
        int answer = 0;
        int cnt = 0;
		boolean check = false;
		check = 1 <= n && n <= 100;
		if(check) {
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= i; j++) {
					if(i%j == 0) {
						cnt++;
					}
				}
				if(cnt >= 3) {
					answer++;
				}
				cnt = 0;
			}
		}
        return answer;
	}
}