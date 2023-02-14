package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_020 {
	//음양 더하기
	public static void main(String[] args) {
		int[] num01 = {4,7,12};
		int[] num02 = {1,2,3};
		boolean[] boo01 = {true,false,true};
		boolean[] boo02 = {false,false,true};
		System.out.println(solution(num01, boo01));
		System.out.println(solution(num02, boo02));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i < absolutes.length; i++) {
        	if(signs[i]) {
        		answer += absolutes[i];
        	} else {
        		answer -= absolutes[i];
        	}
        }
        return answer;
	}
}