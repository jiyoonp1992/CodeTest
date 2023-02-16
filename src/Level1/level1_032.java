package Level1;

import java.util.Arrays;
import java.util.Stack;
import java.lang.reflect.Array;
import java.util.*;

public class level1_032 {
	//같은 숫자는 싫어
	public static void main(String[] args) {
		//System.out.println(solution());
		int[] num01 = {1,1,3,3,0,1,1};
		System.out.println(Arrays.toString(solution(num01)));
	}
	
	public static int[] solution(int []arr) {
        int[] answer = {};
        
        Stack<Integer> st = new Stack<>();
        int x = 0,cnt = 0;
        for(int i :arr) {
        	st.push(i);
        	x = st.size() - 1;
        	if(x > 1) {
        		if(st.get(x-1).equals(st.get(x))) {
        			st.pop();
        		}
        	}
        	answer = Arrays.copyOf(answer, answer.length+1);
        	answer[cnt] = st.get(cnt);
        }
        return answer;
	}
}