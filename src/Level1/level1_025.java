package Level1;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.*;

public class level1_025 {
	//문자열 내림차순으로 배치하기
	public static void main(String[] args) {
		//System.out.println(solution("Zbcdefg"));
		//System.out.println(solution("ZdbgZcdfefg"));
		System.out.println(solution("ZbcdWRWWefag"));
		//System.out.println(solution("ABDCEFvr"));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        answer = new StringBuilder(new String(arr)).reverse().toString();
        return answer;
    }
}