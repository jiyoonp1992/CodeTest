package Level2;

import java.util.Arrays;

public class level2_023 {
	//n^2 배열 자르기
	public static void main(String[] args) {
		//System.out.println(solution());
		System.out.println(Arrays.toString(solution(3, 2, 5)));
		System.out.println(Arrays.toString(solution(4, 7, 14)));
	}
	
	public static int[] solution(int n, long left, long right) {
        int[] answer = {};
        answer = new int[(int) (right - left) + 1];
        long lx = 0, ly = 0;
        lx = left / n; 
        ly = left % n;
        System.out.println(lx);
    	System.out.println(ly);
        for(int i = 0; i < answer.length;i++) {
        	answer[i] = (int) Math.max(lx, ly) + 1;
        	if(lx <= n - 1 && ly < n -1) {
        		ly++;
        	} else if (lx < n - 1 && ly >= n - 1) {
        		lx++;
        		ly = 0;
        	} else {
        		lx = 0;
        	}
        }
        return answer;
	}
}