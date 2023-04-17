package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class level2_039 {
	//주식가격
	public static void main(String[] args) {
		int[] num = {5,4,3,2,5};
		//System.out.println(solution());
		System.out.println(Arrays.toString(solution(num)));
	}
	
	public static int[] solution(int[] prices) {
        int[] answer = {};
        answer = new int[prices.length];
        int cnt = 0;
        for(int i = 0; i < prices.length;i++) {
        	cnt = 0;
        	for(int j = i + 1; j < prices.length;j++) {
        			cnt++;
        			if(prices[i] > prices[j]) {
        				//answer[i] = prices.length - 1 - j;
        				answer[i] = cnt;
        				break;
        			}
        		}
        	answer[i] = cnt;
        	}
        return answer;
//        int[] answer = {};
//        List<Integer> list = Arrays.stream(prices).boxed().collect(Collectors.toList());
//        Collections.sort(list);
//        answer = new int[prices.length];
//        int cnt = 0;
//        for(int i = 0; i < prices.length;i++) {
//        	cnt = 0;
//        	if(list.get(0).equals(prices[i])) {
//        		answer[i] = prices.length - 1 - i;
//        		list.remove(0);
//        	} else {
//        		for(int j = i + 1; j < prices.length;j++) {
//        			cnt++;
//        			if(prices[i] > prices[j]) {
//        				//answer[i] = prices.length - 1 - j;
//        				answer[i] = cnt;
//        				list.remove(list.indexOf(prices[i]));
//        				break;
//        			}
//        		}
//        	}
//        }
//        return answer;
	}
}