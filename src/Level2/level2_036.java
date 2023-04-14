package Level2;

import java.util.Arrays;

public class level2_036 {
	//더 맵게
	public static void main(String[] args) {
		//System.out.println(solution());
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int[] scoville, int K) {
        int answer = 0;
        int cnt = 0;
        long x = scoville[0];
        for(int i : scoville) {
        	if(i < K) {
        		cnt++;
        	}
        }
        
        for(int j = 1; cnt > 0; j++) {
        	if(x < K && scoville[j] < K) {
        		cnt -= 2;
        	} else if (scoville[j] < K) {
        		cnt--;
        	}
        	x = x + scoville[j] * 2;
        	answer++;
        	if(x < K) {
        		cnt++;
        	}
        	
        	if(j >= scoville.length && cnt != 0) {
        		answer = -1;
        		break;
        	}
        }
        return answer;
	}
}