package Level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class level2_052 {
	//다리를 지나는 트럭
	public static void main(String[] args) {
		int[] arr = {1, 1, 1, 1, 1, 2, 2, 2, 2};
		System.out.println(solution(5, 5, arr));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        boolean chek = true;
        int cnt = 0, numCnt = 0;
        long sumW = 0;
        Queue<Integer> numQ = new LinkedList<>();
        while (chek) {
        	answer++;
        	if(cnt == truck_weights.length && numCnt != bridge_length) {
        		numQ.add(0);
        	} else if(cnt == truck_weights.length && numCnt == bridge_length) {
        		sumW -= numQ.poll();
        	} else if(sumW + truck_weights[cnt] <= weight || numCnt == bridge_length && sumW - numQ.peek() + truck_weights[cnt] <= weight) {
        		if(numQ.size() < bridge_length) {
        			sumW += truck_weights[cnt];
        			numQ.add(truck_weights[cnt]);
        		} else if(numQ.size() == bridge_length) {
        			sumW -= numQ.poll();
        			numQ.add(truck_weights[cnt]);
        			sumW += truck_weights[cnt];
        		}
        		cnt++;
        	} else if(sumW + truck_weights[cnt] > weight) {
        		if(numQ.size() < bridge_length) {
        			numQ.add(0);
        		} else if(numQ.size() == bridge_length) {
        			sumW -= numQ.poll();
        			if(sumW + truck_weights[cnt] >= weight) {
        				numQ.add(0);
        			} else {
        				numQ.add(truck_weights[cnt]);
        				sumW += truck_weights[cnt];
        				cnt++;
        			}
        		}
        	}
        	if(numCnt < bridge_length) {
        		numCnt = numQ.size();
        	}
        	if(cnt >= truck_weights.length && numQ.isEmpty() || cnt >= truck_weights.length && sumW == 0) {
        		chek = false;
        	}
        }
        return answer;
	}
}