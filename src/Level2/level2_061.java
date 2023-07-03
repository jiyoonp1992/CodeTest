package Level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class level2_061 {
	//연속된 부분 수열의 합
	public static void main(String[] args) {
		int[] arr = {5,5,5};
		//System.out.println(solution());
		System.out.println(Arrays.toString(solution(arr, 4)));
	}
	
	public static int[] solution(int[] sequence, int k) {
        int[] answer = {};
        answer = new int[2];
        
        int[] sumArr = {};
        sumArr = new int[sequence.length + 1];
        for(int i = 0; i < sumArr.length; i++) {
        	if(i == 0) {
        		sumArr[i] = 0;
        	} else {
        		sumArr[i] = sumArr[i-1] + sequence[i - 1];
        	}
        }
        
        for(int x = sumArr.length - 1; x > 0; x--) {
        	for(int y = x - 1; y > 0; y--) {
        		if(sumArr[x] - sumArr[y] == k) {
        			answer[0] = y;
        			answer[1] = x;
        		}
        	}
        }
        
//        TreeSet<Integer> tS = new TreeSet<>();
//        Map<Integer, Integer> mNum = new HashMap<>();
//        
//        for(int i = 0; i < sequence.length; i++) {
//        	if(sequence[i] == k) {
//        		answer[0] = i;
//        		answer[1] = i;
//        		break;
//        	} else {
//        		tS.add(sequence[i]);
//        		mNum.put(sequence[i], mNum.getOrDefault(sequence[i], 0)+1);
//        	}
//        }
//        
//        boolean ch = true;
//        int maxNum = 0, maxCnt = 0, minNum = 0, minCnt = 0, sum = 0;
//        
//        while(!tS.isEmpty()) {
//        	if(sum == 0 && maxNum == 0) {
//        		maxNum = tS.last();
//        		maxCnt = mNum.get(maxNum);
//        		sum += maxNum * maxCnt;
//        	} else if(tS.last() != minNum) {
//        		minNum = tS.last();
//        		minCnt = 1;
//        		sum += minNum * 1;
//        	}
//        	
//        	System.out.println(tS);
//        	System.out.println(maxCnt);
//        	System.out.println(sum);
//        	if(sum > k) {
//        		if(maxCnt >= 1) {
//        			maxCnt--;
//        			sum -= maxNum;
//        		} else {
//        			tS.pollLast();
//        		}
//        	} else if (sum < k) {
//        		if(minCnt < mNum.get(minNum)) {
//        			minCnt++;
//        			sum += minNum;
//        		} else if(minCnt == mNum.get(minNum)) {
//        			tS.pollLast();
//        		}
//        	} else {
//        		tS.clear();
//        	}
//        	
//        	if(maxCnt == 1) {
//        		maxNum = minNum;
//        		maxCnt = minCnt;
//        	}
//        	
//        }
        return answer;
	}
}