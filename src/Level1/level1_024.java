package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_024 {
	//내적
	public static void main(String[] args) {
		//System.out.println(solution());
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i = 0; i < a.length; i++){
            answer +=  a[i] * b[i];
        }
        return answer;
	}
}