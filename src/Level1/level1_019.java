package Level1;

import java.util.Arrays;

public class level1_019 {
	//제일 작은 수 제거하기
	public static void main(String[] args) {
		int[] num01 = {4,3,2,1};
		int[] num02 = {10};
		//System.out.println(solution());
		System.out.println(Arrays.toString(solution(num01)));
		System.out.println(Arrays.toString(solution(num02)));
	}
	
	public static int[] solution(int[] arr) {
        int[] answer = {};
        if(arr.length == 1) {
        	answer = new int[] {-1};
        } else {
        	int x = arr[0];
        	for(int i : arr) {
        		x = Math.min(x,i);
        	}
        	
        	for(int i : arr) {
        		if(x < i) {
        			answer = Arrays.copyOf(answer, answer.length + 1);
        			answer[answer.length - 1] = i;
        		}
        	}
        }
        return answer;
	}
}