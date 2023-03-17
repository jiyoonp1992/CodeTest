package Level2;

import java.util.Arrays;

public class level2_003 {
	//
	public static void main(String[] args) {
		//System.out.println(solution());
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int []A, int []B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i = 0; i < A.length; i++) {
        	answer += A[i] * B[B.length - 1 - i];
        }
        return answer;
	}
}