package Level2;

import java.util.Arrays;
import java.util.Stack;

public class level2_058 {
	//택배상자
	public static void main(String[] args) {
		int[] num = {5, 4, 3, 2, 1};
		System.out.println(solution(num));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int[] order) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        boolean ch = true;
        int i = 0, cnt = 1;
        while(ch && i < order.length) {
        	if(st.empty()) {
        		st.push(cnt);
        		cnt++;
        	} else {
        		if (order[i] != st.peek() && order[i] == cnt) {
        			cnt++;
        			answer++;
        			i++;
        		} else if (order[i] == st.peek() && order[i] != cnt) {
        			answer++;
        			i++;
        			st.pop();
        		} else if(order[i] > st.peek() && order[i] != cnt) {
        			st.push(cnt);
        			cnt++;
        		} else if(order[i] > st.peek() && order[i] == cnt) {
        			answer++;
        			i++;
        			cnt++;
        		} else if(order[i] < st.peek() && order[i] < cnt) {
        			ch = false;
        		}
        	}
        }
        
//        int answer = 0;
//        Stack<Integer> st = new Stack<>();
//        boolean ch = true;
//        int i = 0, cnt = 1;
//        while(ch && i < order.length) {
//        	if(st.contains(order[i])) {
//        		if(order[i] != st.peek() && order[i] != cnt) {
//        			ch = false;
//        		} else if (order[i] != st.peek() && order[i] == cnt) {
//        			cnt++;
//        			answer++;
//        			i++;
//        		} else if (order[i] == st.peek() && order[i] != cnt) {
//        			answer++;
//        			i++;
//        			st.pop();
//        		}
//        	} else {
//        		if(order[i] != cnt) {
//            		st.push(cnt);
//            		cnt++;
//            	} else {
//            		answer++;
//            		i++;
//            		cnt++;
//            	}
//        	}
//        }
        
        return answer;
	}
}