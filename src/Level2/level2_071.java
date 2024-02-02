package Level2;

import java.util.*;

public class level2_071 {
	//[카카오 인턴] 수식 최대화
	public static void main(String[] args) {
		System.out.println(solution("100-200*300-500+20"));
	}
	public static long solution(String expression) {
        long answer = 0;
        StringBuilder sb = new StringBuilder();
        int temp = 0;
        List<Integer> numList = new ArrayList<>();
        List<Character> oprtrList = new ArrayList<>();
        List<Character> priOprtrList = new ArrayList<>();
        for(int i = 0; i < expression.length(); i++) {
        	if(Character.isDigit(expression.charAt(i))){
        		sb.append(expression.charAt(i));
        	} else {
        		numList.add(Integer.parseInt(sb.toString()));
        		sb.delete(0, sb.length());
        		oprtrList.add(expression.charAt(i));
        		if(!priOprtrList.contains(expression.charAt(i))) {
        			priOprtrList.add(expression.charAt(i));
        		}
        	}
        	if(i == expression.length() - 1) {
        		numList.add(Integer.parseInt(sb.toString()));
        	}
        }
        
        return answer;
	}
	
	static void permutation(int[] arr, int depth, int n, int r) {
	    if (depth == r) {
	        return;
	    }
	 
	    for (int i=depth; i<n; i++) {
	        swap(arr, depth, i);
	        permutation(arr, depth + 1, n, r);
	        swap(arr, depth, i);
	    }
	}
	 
	static void swap(int[] arr, int depth, int i) {
	    int temp = arr[depth];
	    arr[depth] = arr[i];
	    arr[i] = temp;
	}
	
}