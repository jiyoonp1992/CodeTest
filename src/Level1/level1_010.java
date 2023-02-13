package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_010 {
	//정수 내림차순으로 배치하기
	public static void main(String[] args) {
		System.out.println(solution(118372));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        String ansStr = "";
        for(int i = 9; i >= 0; i--) {
        	if(str.contains(i+"")){
        		str = str.replaceFirst(i+"", "");
        		ansStr += i+"";
        		i++;
        	}
        }
        answer = Long.valueOf(ansStr);
        return answer;
	}
}