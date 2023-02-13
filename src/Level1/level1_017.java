package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_017 {
	//나누어 떨어지는 숫자 배열
	public static void main(String[] args) {
		int[] num01 = {5, 9, 7, 10};
		int[] num02 = {2, 36, 1, 3};
		int[] num03 = {3,2,6};
		//System.out.println(solution());
		System.out.println(Arrays.toString(solution(num01, 5)));
		System.out.println(Arrays.toString(solution(num02, 1)));
		System.out.println(Arrays.toString(solution(num03, 10)));
	}
	
	public static int[] solution(int[] arr, int divisor) {
		int[] answer = {};
        int j = 0;
        Arrays.sort(arr);
        for(int i : arr) {
        	if(i % divisor == 0) {
        		answer = Arrays.copyOf(answer, answer.length + 1);
        		answer[j] = i;
        		j++;
        	}
        }
        if(answer.length == 0) {
        	answer = new int[1];
        	answer[0] = -1;
        }
        return answer;
	}
}