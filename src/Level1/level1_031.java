package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_031 {
	//최대공약수와 최소공배수
	public static void main(String[] args) {
		//System.out.println(solution());
		//System.out.println(Arrays.toString(solution(3,12)));
		System.out.println(Arrays.toString(solution(2,5)));
	}
	
	public static int[] solution(int n, int m) {
        int[] answer = {};
        
		answer = new int[] {1,1};
		for(int i = 2; n > 1 || m > 1;) {
			if(n%i == 0 || m%i == 0) {
				if(n%i == 0 && m%i == 0) {
					answer[0] = i * answer[0];
					answer[1] = i * answer[1];
					n /= i;
					m /= i;
				} else {
					answer[1] = i * answer[1];
					if(n%i == 0) {
						n /= i;
					} else if(m % i == 0) {
						m /= i;
					}
				}
			} else {
				i++;
			}
		}
        return answer;
	}
}