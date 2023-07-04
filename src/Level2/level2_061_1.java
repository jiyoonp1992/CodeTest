package Level2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class level2_061_1 {
	//연속된 부분 수열의 합
	public static void main(String[] args) {
		int[] arr = {1,1,1,1};
		//System.out.println(solution());
		System.out.println(Arrays.toString(solution(arr, 3)));
	}
	
	public static int[] solution(int[] sequence, int k) {
        int[] answer = {};
        answer = new int[2];
        
        Set<Integer> numSet = new LinkedHashSet<>();
        
        boolean ch = true;
        int le = sequence.length - 1, ri = sequence.length - 1, cnt = 0;
        long sum = 0L;
        
        
        while(ch || le < 0 || ri < 0) {
        	if(sequence[le] == sequence[ri]) {
        		cnt++;
        	}
        	if(le == ri) {
        		sum += sequence[le];
        		if(sequence[le] == k) {
        			answer[0] = le;
        			answer[1] = le;
        			ch = false;
        		}
        		le--;
        	} else {
        		if(sum == k && cnt != ri-le) {
        			System.out.println(cnt);
        			System.out.println(sum);
       				answer[0] = le;
       				answer[1] = ri;
       				ch = false;
        		} else if(sum < k) {
        			if(le > 0) {
        				le--;
        			}
        			sum += sequence[le];
        		} else {
        			if(ri > 0) {
        				ri--;
        			}
        			sum += sequence[ri] - sequence[ri + 1];
        		}
        	}
        }
        return answer;
	}
}