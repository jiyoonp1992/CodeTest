package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_008 {
	//x만큼 간격이 있는 n개의 숫자
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(2, 5)));
		System.out.println(Arrays.toString(solution(4, 3)));
		System.out.println(Arrays.toString(solution(-4, 2)));
	}
	
	public static long[] solution(int x, int n) {
		long[] answer = {};
        answer = new long[n];
        for (int i = 0; i < n; i++) {
        	answer[i] = (long) x * (i + 1);
        }
        return answer;
	}
}