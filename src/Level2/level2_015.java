package Level2;

import java.util.Arrays;

public class level2_015 {
	//N개의 최소공배수
	public static void main(String[] args) {
		int[] num01 = {10,12};
		System.out.println(solution(num01));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int x = 0, y = 0, z = 0, min = 0, max = 0;
        for(int i = 1; i < arr.length; i++) {
        	if(i == 1) {
        		x = arr[0];
        		y = arr[i];
        	} else {
        		x = Math.min(x, arr[i]);
        		y = Math.max(x, arr[i]);
        	}
        	
        	if(y%x == 0) {
        		z = x;
        	} else {
        		min = x;
        		max = y;
        		for(;max%min != 0;) {
        			z = max % min;
        			
        		}
        	}
        }
        
        answer = (x * y) / x;
        
        return answer;
	}
}