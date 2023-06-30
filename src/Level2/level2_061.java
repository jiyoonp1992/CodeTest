package Level2;

import java.util.Arrays;

public class level2_061 {
	//연속된 부분 수열의 합
	public static void main(String[] args) {
		//System.out.println(solution());
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int[] solution(int[] sequence, int k) {
        int[] answer = {};
        answer = new int[2];
        int j = 1, sum = 0;
        
        if(Arrays.toString(sequence).indexOf(k) == -1) {
        	answer[0] = Arrays.asList(sequence).indexOf(k);
        	answer[1] = Arrays.asList(sequence).indexOf(k);
        } else {
        	for(int i = 0; ;i++) {
        		
        	}
        }
        return answer;
	}
}