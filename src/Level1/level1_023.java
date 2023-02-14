package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_023 {
	//수박수박수박수박수박수?
	public static void main(String[] args) {
		System.out.println(solution(3));
		System.out.println(solution(4));
		System.out.println(solution(50));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static String solution(int n) {
        String answer = "";
        if(n==0) {
        	answer = "";
        } else {
        	for(int i = 1; i <= n; i++) {
        		if(i%2 != 0) {
        			answer = answer + "수";
        		} else {
        			answer = answer + "박";
        		}
        	}
        }
        return answer;
	}
}