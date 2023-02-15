package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_026 {
	//약수의 개수와 덧셈
	public static void main(String[] args) {
		System.out.println(solution(13, 17));
		System.out.println(solution(24, 27));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int left, int right) {
        int answer = 0;
		boolean check = 1 <= left && left <= right && right <= 1000;
		if(check) {
			int cnt = 0;
			for(int i = left;i <=right;i++) {
				cnt = 0;
				for(int j = 1; j <= Math.sqrt(i);j++) {
					if(i%j == 0 && j == Math.sqrt(i)) {
						cnt += 1;
					} else if (i%j == 0) {
						cnt += 2;
					}
				}
				if(cnt % 2 == 0) {
					answer += i;
				} else {
					answer -= i;
				}
			}
		}
        return answer;
	}
}