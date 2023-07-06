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
        long tSum = 0L, sum01 = 0L, sum02 = 0L, cnt = 0L;
        int max = 0, chMax = 0, x = 0;
        Queue<Integer> qu1 = new LinkedList<Integer>();
        Queue<Integer> qu2 = new LinkedList<Integer>();
        boolean ch = true;

        for(int i = 0; i < queue1.length;i++) {
        	tSum += queue1[i] + queue2[i];
        	sum01 += queue1[i];
        	sum02 += queue2[i];
        	max = Math.max(Math.max(max, queue1[i]), queue2[i]);
        	qu1.offer(queue1[i]);
        	qu2.offer(queue2[i]);
        	if(max == queue1[i]) {
        		chMax = 1;
        	} else if (max == queue2[i]) {
        		chMax = 2;
        	}
        }
        
        if(max > tSum / 2 || tSum % 2 == 1) {
        	answer = -1;
        } else if(sum01 == sum02) {
        	//테스트케이스 2번
        	answer = 0;
        } else {
        	while(ch) {
        		cnt++;
        		if(max == (tSum / 2)) {
        			answer++;
        			if(chMax == 1) {
        				if(qu1.peek() != max) {
        					qu2.offer(qu1.poll());
        				} else {
        					answer += qu2.size();
        					ch = false;
        				}
        			} else {
        				if(qu2.peek() != max) {
        					qu1.offer(qu2.poll());
        				} else {
        					answer += qu1.size();
        					ch = false;
        				}
        			}
        		} else {
        			if(sum01 > sum02) {
        				answer++;
        				x = qu1.poll();
        				sum01 -= x;
        				sum02 += x;
        				qu2.offer(x);
        			} else if(sum01 < sum02) {
        				answer++;
        				x = qu2.poll();
        				sum01 += x;
        				sum02 -= x;
        				qu1.offer(x);
        			} else {
        				ch = false;
        			}
        		}
        		
        		if(cnt > 600001) {
        			ch = false;
        			answer = -1;
        		}
        	}
        }
        return answer;
	}
}