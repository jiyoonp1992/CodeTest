package Level2;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class level2_068 {
	//전력망 둘로 나누기
	public static void main(String[] args) {
		int[][] intArr1 = {{1,3}, {2,3}, {3,4}, {4,5}, {4,6}, {4,7}, {7,8}, {7,9}};
		int[][] intArr2 = {{1,2}, {2,7}, {3,7}, {3,4}, {4,5}, {6,7}};
		int[][] intArr3 = {{1,2}, {2,3}, {3,4}};
		System.out.println(solution(9, intArr1));
		System.out.println(solution(7, intArr2));
		System.out.println(solution(4, intArr3));
	}
	
	public static int solution(int n, int[][] wires) {
		int answer = -1;
		int[] answerArr = new int[n];
		int cnt = 0;
		if(n%2 == 0) {
			cnt = n/2;
		} else {
			cnt = n/2 + 1;
		}
		for(int i = 0; i < cnt; i++) {
			for(int[] intArr : wires) {
				if((i + 1) != (n-i)) {
					answerArr[i] = i + 1 == intArr[0] ? ++answerArr[i] : answerArr[i];
					answerArr[i] = i + 1 == intArr[1] ? ++answerArr[i] : answerArr[i];
					answerArr[n - i - 1] = n - i == intArr[0] ? ++answerArr[n - i - 1] : answerArr[n - i - 1];
					answerArr[n - i - 1] = n - i == intArr[1] ? ++answerArr[n - i - 1] : answerArr[n - i - 1];
				} else {
					answerArr[i] = i + 1 == intArr[0] ? ++answerArr[i] : answerArr[i];
					answerArr[i] = i + 1 == intArr[1] ? ++answerArr[i] : answerArr[i];
				}
			}
		}
		Arrays.sort(answerArr);
		answerArr[n-1] = answerArr[n-1] - 1;
		answerArr[n-2] = answerArr[n-2] - 1;
		answerArr[n-3] = answerArr[n-3] - 1 != 0 ? answerArr[n-3] - 1 : 1;
		int num = 0;
		PriorityQueue<Integer> priqueue = new PriorityQueue<Integer>();
		for(int j = 0; j < answerArr.length; j++) {
			num = answerArr[j];
			if(priqueue.isEmpty()) {
				priqueue.add(num);
			} else {
				if(priqueue.contains(num)) {
					priqueue.remove(num);
				} else {
					priqueue.add(num);
				}
			}
		}
		if(priqueue.isEmpty()) {
			answer = 0;
		} else {
			answer = priqueue.poll();
		}
		return answer;
	}
}