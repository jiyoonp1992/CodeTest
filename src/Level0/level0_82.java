package Level0;

import java.util.Arrays;

public class level0_82 {
	//종이 자르기
	public static void main(String[] args) {
		System.out.println(solution(3,3));
	}
	
	public static int solution(int M, int N) {
		int answer = 0;
		boolean check = false;
		check = 0 < M && N < 100;
		if(check) {
            int min = Math.min(M, N);
            int max = Math.max(M, N);
			answer = (min - 1) + (max-1) * (min);
		}
        return answer;
	}
}