package Level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class level2_062 {
	//두 큐 합 같게 만들기
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 1, 2};
		int[] arr2 = {1, 10, 1, 2};
		System.out.println(solution(arr1, arr2));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        long tSum = 0L, sum01 = 0L, sum02 = 0L;
        int max = 0, chMax = 0;
        Queue<Integer> qu1 = new LinkedList<Integer>();
        Queue<Integer> qu2 = new LinkedList<Integer>();
        boolean ch = true;
        for(int i = 0; i < queue1.length;i++) {
        	tSum += queue1[i] + queue2[i];
        	sum01 += queue1[i];
        	sum02 += queue2[i];
        	max = Math.max(Math.max(max, queue1[i]), queue2[i]);
        	qu1.add(queue1[i]);
        	qu2.add(queue2[i]);
        	if(max == queue1[i]) {
        		chMax = 1;
        	} else if (max == queue2[i]) {
        		chMax = 2;
        	}
        }
        if(max > tSum / 2) {
        	answer = -1;
        } else {
        	while(ch) {
        		if(max == tSum / 2) {
        			if(chMax == 1) {
        				if(qu1.peek() != max) {
        					qu2.add(qu1.poll());
        					answer++;
        				} else {
        					answer += qu2.size() + 1;
        					ch = false;
        				}
        			} else {
        				if(qu2.peek() != max) {
        					qu1.add(qu2.poll());
        					answer++;
        				} else {
        					answer += qu1.size() + 1;
        					ch = false;
        				}
        			}
        		} else {
        			if(sum01 > sum02) {
        				
        			} else if(sum01 < sum02) {
        				
        			} else {
        				
        			}
        		}
        	}
        }
        return answer;
	}
}