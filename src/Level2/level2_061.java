package Level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class level2_061 {
	//연속된 부분 수열의 합
	public static void main(String[] args) {
		int[] arr = {7,5,5,1,1,50,50};
		//System.out.println(solution());
		System.out.println(Arrays.toString(solution(arr, 100)));
	}
	
	public static int[] solution(int[] sequence, int k) {
        int[] answer = {};
        answer = new int[2];
        
        int[] sumArr = {};
        sumArr = new int[sequence.length + 1];
        Set<Integer> numSet = new LinkedHashSet<>();
        for(int i = 0; i < sumArr.length; i++) {
        	if(i == 0) {
        		if(sequence[i] == k) {
        			answer[0] = i;
        			answer[1] = i;
        			numSet.clear();
        			break;
        		} else {
        			numSet.add(sequence[i]);
        			sumArr[i] = 0;
        		}
        	} else {
        		if(sequence[i-1] == k) {
        			answer[0] = i-1;
        			answer[1] = i-1;
        			numSet.clear();
        			break;
        		} else {
        			numSet.add(sequence[i-1]);
        			sumArr[i] = sumArr[i-1] + sequence[i - 1];
        		}
        	}
        }
        
        if(numSet.size() > 1) {
        	int x = 0;
            int y = sumArr.length - 1;
            
            while (x < sumArr.length) {
                if (sumArr[y] - sumArr[x] == k) {
                	answer[0] = x;
                	answer[1] = y-1;
                	break;
                } else if (sumArr[y] - sumArr[x] < k) {
                	if(x < sumArr.length) {
                		x++;
                	}
                	if(y < sumArr.length) {
                		y++;
                	}
                } else {
                	if(y > 0) {
                		y--;
                	}
                }
            }
        } else if (numSet.size() == 1){
        	for(int i = 0; i < sumArr.length; i++) {
        		if(sumArr[i] == k) {
        			answer[0] = 0;
        			answer[1] = i - 1;
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