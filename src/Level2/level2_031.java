package Level2;

import java.util.Arrays;

public class level2_031 {
	//k진수에서 소수 개수 구하기
	public static void main(String[] args) {
		System.out.println(solution(437674, 3));
		System.out.println(solution(110011, 10));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int n, int k) {
        int answer = 0;
        String str = Integer.toString(n, k);
        String[] strArr = {};
        strArr = str.split("0");
        long num = 0;
        for(String strNum : strArr) {
        	if(!strNum.isEmpty()) {
        		num = Long.valueOf(strNum).longValue();
        		if(num >= 2) {
        			answer++;
        			for (int i = 2; i <= Math.sqrt(num); i++) {
        		        if (num % i == 0) {
        		        	answer--;
        		            break;
        		        }
        		    }
        		}
        	}
        }
        return answer;
	}
}