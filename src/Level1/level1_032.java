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
        for(int i :arr) {
        	if(st.size() == 0) {
        		st.push(i);
        	} else if(st.get(st.size()-1) != i) {
        		st.push(i);
        	}
        }
        
        answer = new int[st.size()];
        for(int i = 0; i < st.size();i++) {
        	answer[i] = st.get(i);
        }
        return answer;
	}
}