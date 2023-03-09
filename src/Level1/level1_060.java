package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_060 {
	//기사단원의 무기
	public static void main(String[] args) {
		System.out.println(solution(10,3,2));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int number, int limit, int power) {
        int answer = 0;
		boolean check = 1 <= number && number <= 100000 && 2 <= limit && limit <= 100 && 1 <= power && power <= limit;
		if(check) {
			int[] num = new int[number];
			for(int i = 1; i <= number; i++) {
				for(int j = 1; j <= Math.sqrt(i); j++) {
					if(i == 1) {
						num[i-1]++;
					} else if(j != 1 && i == (j * j)) {
						num[i-1]++;
					} else if(i % j == 0) {
						num[i-1] += 2;
					}
					
					if(num[i-1] > limit) {
						num[i-1] = power;
						break;
					}
				}
			}
			answer = Arrays.stream(num).sum();
		}
        return answer;
	}
}