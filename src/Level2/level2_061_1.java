package Level2;

import java.util.Arrays;

public class level2_061_1 {
	//연속된 부분 수열의 합
	public static void main(String[] args) {
		int[] arr = {1, 1, 1, 2, 3, 4, 5};
		//System.out.println(solution());
		System.out.println(Arrays.toString(solution(arr, 5)));
	}
	
	public static int[] solution(int[] sequence, int k) {
        int[] answer = {};
        answer = new int[2];
        
        int[] ansSum = new int[sequence.length + 1];
        int le = 0, ri = 0, total = 0, max = 0, min = 0;
        
        for(int i = 0; i < ansSum.length;i++) {
        	if(i < sequence.length && sequence[i] == k) {
        		answer[0] = i;
        		answer[1] = i;
        		ri = ansSum.length+1;
        		break;
        	}
        	if(i == 0) {
        		ansSum[i] = 0;
        	} else {
        		ansSum[i] = ansSum[i-1] + sequence[i-1];
        	}
        }
        max = ansSum.length;
        while(ri < ansSum.length) {
        	total = ansSum[ri]-ansSum[le];
        	if(total == k) {
        		min = ri - 1 - le;
        		if(max > min){
        			answer[0] = le;
           			answer[1] = ri-1;
           			max = min;
                }
       		} 
        	
        	if(total < k) {
        		ri++;
       		} else {
       			le++;
       		}
        }
        return answer;
	}
}
