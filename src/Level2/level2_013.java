package Level2;

import java.util.Arrays;

public class level2_013 {
	//예상 대진표
	public static void main(String[] args) {
		System.out.println(solution(8,4,7));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int n, int a, int b) {
        int answer = 0;
        int x = 0, max = 0, min = 0;
        x = n / 2;
        max = Math.max(a, b);
        min = Math.min(a, b);
        if (max <= x) {
        	
        } else if(min <= x && x < max) {
        	for(int i = 0 ;n > 1; i++) {
        		n = n / 2;
        		answer++;
        	}
        } else if(min > x) {
        	
        }
        return answer;
	}
}