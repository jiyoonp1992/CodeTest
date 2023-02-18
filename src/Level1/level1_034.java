package Level1;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.*;

public class level1_034 {
	//이상한 문자 만들기
	public static void main(String[] args) {
		//System.out.println(solution("try   hello world "));
		//System.out.println(solution("try   hello world   "));
		System.out.println(solution("try   hello    world   "));
		//System.out.println(solution("try   hello world"));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static String solution(String s) {
        String answer = "";
        char[] strArr = s.toCharArray();
        int cnt = 0;
        for(char arr : strArr) {
        	if(arr == ' ') {
        		cnt = 0;
        	} else {
        		if(cnt % 2 == 0) {
        			arr = Character.toUpperCase(arr);
        		} else {
        			arr = Character.toLowerCase(arr);
        		}
        		cnt++;
        	}
        	answer += arr;
        }
        return answer;
	}
}