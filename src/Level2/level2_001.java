package Level2;

import java.util.Arrays;

public class level2_001 {
	//최댓값과 최솟값
	public static void main(String[] args) {
		System.out.println(solution("9999 9998 9999"));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static String solution(String s) {
        String answer = "";
		int[] str = {};
		str = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(str);
		int min = Math.min(str[0], str[str.length - 1]), max = Math.max(str[0], str[str.length - 1]);
		answer = min + " " + max;
        return answer;
	}
}