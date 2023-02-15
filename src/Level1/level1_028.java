package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_028 {
	//부족한 금액 계산하기
	public static void main(String[] args) {
		//System.out.println(solution());
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;
        boolean check = 1 <= price && price <= 2500 && 1 <= money && money <= 1000000000
        		&& 1 <= count && count <= 2500;
		if(check) {
			for(int i = 1; i <= count;i++) {
				sum += price * i; 
			}
        	if(sum >= money) {
        		answer = sum - money;
        	} else {
        		answer = 0;
        	}
		} else {
			answer = 0;
		}
        return answer;
	}
}