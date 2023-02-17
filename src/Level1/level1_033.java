package Level1;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.*;

public class level1_033 {
	//3진법 뒤집기
	public static void main(String[] args) {
		System.out.println(solution(45));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int n) {
        int answer = 0;
        char[] arr = Integer.toString(n,3).toCharArray();
        String str = "";
        str = new StringBuilder(new String(arr)).reverse().toString();
        answer = Integer.parseInt(str, 3);
        return answer;
	}
}